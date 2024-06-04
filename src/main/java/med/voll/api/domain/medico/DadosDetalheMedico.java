package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalheMedico(Long id, String nome, String crm, String email, String telefone, Especialidade especialidade, Endereco endereco) {

    public DadosDetalheMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }

}