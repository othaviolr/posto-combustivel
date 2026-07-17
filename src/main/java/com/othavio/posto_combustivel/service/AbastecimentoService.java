package com.othavio.posto_combustivel.service;

import com.othavio.posto_combustivel.infrastructure.entities.Abastecimento;
import com.othavio.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import com.othavio.posto_combustivel.infrastructure.repositories.AbastecimentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor

public class AbastecimentoService {

    private final AbastecimentoRepository abastecimentoRepository;
    private final BombaDeCombustivelService bombaDeCombustivelService;

    public void abastecer(Integer IdBomba, Long litros){
        BombasDeCombustivel bomba = bombaDeCombustivelService.buscarBombaCombustivelPorId(IdBomba);

        BigDecimal valoTotal = bomba.getTiposDeCombustivel()
                .getPrecoPorLitro().multiply(BigDecimal.valueOf(litros));

        Abastecimento abastecimento = Abastecimento.builder()
                .dataAbastecimento(LocalDate.now())
                .bombasDeCombustivel(bomba)
                .valorTotal(valoTotal)
                .quantidadeLitros(litros)
                .build();

        abastecimentoRepository.save(abastecimento);
    }

    public List<Abastecimento> buscarAbastecimento(){
       return abastecimentoRepository.findAll();
    }
}
