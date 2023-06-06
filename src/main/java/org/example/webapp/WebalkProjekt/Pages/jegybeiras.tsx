import React from 'react';
import { Container, Heading, Select, Table, Tbody, Td, Th, Thead, Tr } from '@chakra-ui/react';

const Jegybeiras = () => {

  return (
    <Container mt={4}>
      <Heading mt={4} as="h1" size="xl">
          Tárgy jegybeírás
      </Heading><div className="form-group">
              <label htmlFor="subjectSelect">Válassz tárgyat:</label>
              <Select id="subjectSelect" className="form-control">
                  <option value="">Összes tárgy</option>
                  <option value="targy1">Tárgy#1</option>
                  <option value="targy2">Tárgy#2</option>
                  <option value="targy3">Tárgy#3</option>
              </Select>
          </div><Heading as="h2" size="lg" mt={4}>
              Hallgatók
          </Heading><div className="table-responsive">
              <Table className="table" mt={2}>
                  <Thead>
                      <Tr>
                          <Th scope="col">Neptun kód</Th>
                          <Th scope="col">Név</Th>
                          <Th scope="col">Jegy</Th>
                      </Tr>
                  </Thead>
                  <Tbody>
                      <Tr>
                          <Td>ABC123</Td>
                          <Td>Máté</Td>
                          <Td>
                              <Select className="form-control">
                                  <option value="">Válassz jegyet</option>
                                  <option value="1">Elégtelen</option>
                                  <option value="2">Elégséges</option>
                                  <option value="3">Közepes</option>
                                  <option value="4">Jó</option>
                                  <option value="5">Jeles</option>
                              </Select>
                          </Td>
                      </Tr>
                      <Tr>
                          <Td>DEF456</Td>
                          <Td>Tamás</Td>
                          <Td>
                              <Select className="form-control">
                                  <option value="">Válassz jegyet</option>
                                  <option value="1">Elégtelen</option>
                                  <option value="2">Elégséges</option>
                                  <option value="3">Közepes</option>
                                  <option value="4">Jó</option>
                                  <option value="5">Jeles</option>
                              </Select>
                          </Td>
                      </Tr>
                  </Tbody>
              </Table>
          </div>
    </Container>
  );
};

export default Jegybeiras;
