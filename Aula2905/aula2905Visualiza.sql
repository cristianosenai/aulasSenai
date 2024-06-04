SELECT * FROM MEDICO;
SELECT * FROM PESSOA;
SELECT * FROM ESPECIALIDADE;
SELECT * FROM ESPECIALIDADECLINICA;
SELECT * FROM CONSULTA;

CREATE VIEW MEDICOS_ESPECIALIDADE( nomeCompleto, numeroCrm, estado) AS 
select m.nomeCompleto, m.numeroCrm, m.estado from MEDICO m, especialidadeclinica ec
where ec.idespecialidade = 3;

SELECT *
FROM especialidade
INNER JOIN especialidadeclinica ON especialidade.idEspecialidade = especialidadeclinica.idEspecialidade;

SELECT *
FROM especialidadeclinica
INNER JOIN medico ON especialidadeclinica.numeroCrm = medico.numeroCrm;

SELECT especialidade.*, P.*
FROM especialidade
INNER JOIN (
    SELECT especialidadeclinica.idEspecialidade, medico.numeroCrm AS medico_numeroCrm -- Use aliases to differentiate columns with the same name
    FROM especialidadeclinica
    INNER JOIN medico ON especialidadeclinica.numeroCrm = medico.numeroCrm
) AS P ON especialidade.idEspecialidade = P.idEspecialidade;
