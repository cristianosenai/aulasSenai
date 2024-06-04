use aula2805;

INSERT INTO MEDICO (nomeCompleto, numeroCrm, estado) 
VALUES  ('Maria',23445, 'DF'),
		('Fulano de tal',23445, 'BA'),
		('Marcelinho',45353, 'CE');   
        
INSERT INTO ESPECIALIDADE (nomeEspecialidade)
VALUES  ('Cardiologia'),
		('Ortopedia'),
        ('Pediatria'),
        ('Fonoaudiologia'),
        ('Ginecologia'),
        ('Dermatologia'),
        ('Urologia');
        
INSERT INTO ESPECIALIDADECLINICA(numeroCrm, estado, idEspecialidade)
VALUES  (23445, 'DF',3),
		(23445, 'BA',4),
		(45353, 'CE', 6);   
        
INSERT INTO PACIENTE (nomeCompleto, dataNascimento, sexo, rua, numero, bairro, cidade, estado, complemento, cep) VALUES
('João Silva', '1990-05-15', 'M', 'Rua Januário', '123', 'Centro', 'São Paulo', 'SP', 'Apartamento 101', 12345678),
('Maria Oliveira', '1985-10-20', 'F', 'Rua Flamengo', '456', 'Bela Vista', 'Rio de Janeiro', 'RJ', 'Apt 103', 23456789),
('Pedro Santos', '1978-08-07', 'M', 'Rua Cardoso', '789', 'Copacabana', 'Rio de Janeiro', 'RJ', NULL, 34567890);

INSERT INTO TELEFONEPACIENTE (idPaciente, telefonePaciente) VALUES
(1, 98789878),
(2, 95949594),
(3, 93929392);

INSERT INTO CONSULTA (dataConsulta, numeroCrm, estado, idPaciente) VALUES
('2024-06-01 10:00:00', 23445, 'DF', 1),
('2024-06-02 11:30:00', 23445, 'BA', 2),
('2024-06-03 09:45:00', 45353, 'CE', 3);

INSERT INTO RECEITA (idConsulta, descricao) VALUES
(7, 'Tomar um comprimido de 8 em 8 horas'),
(8, 'Tomar um comprimido de 12 em 12 horas por 7 dias');
