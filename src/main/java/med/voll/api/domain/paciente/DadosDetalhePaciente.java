package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhePaciente(Long id, String cpf, String email, String nome, String telefone, Endereco endereco) {

    public DadosDetalhePaciente(Paciente paciente){
        this(paciente.getId(), paciente.getEmail(), paciente.getCpf(), paciente.getNome(), paciente.getTelefone(), paciente.getEndereco());
    }

}
