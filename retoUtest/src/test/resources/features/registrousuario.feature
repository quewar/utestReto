#Autor: Kevin Giron
@stories
Feature:  Registrarme en Utest
  Como usuario requiero , diligenciar un formulario para lograr  registrarme en la pagina
  @scenario1
  Scenario: Diligenciar formulario de registro
    Given Kevin quiere registrarse en Utest
     When debera validar que el usuario no exista  y los datos que ingresa
       | strNombre | strApellido | strCorreo                 | strMes | strDia | strAno | strCiudad | strCodigo | strPais | strComputadora | strVersion| strIdioma | strMovil | strModelo | strOperativo | strContrasena |
       | Kevin     | Giron       | iu@sad764ud.com | August | 1      | 1999   | Cali      | 760026    | Colombia| Windows        | 2000      | English   | Alcatel  | OT-890    | Android 2.2  | Contreña123   |

    Then el registro se realizo de manera exitosa o el usuario existe o  los datos no son correctos
     | strTitulo |
     | Welcome to the world's largest community of freelance software testers! |