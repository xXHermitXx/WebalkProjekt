import React from 'react';
import {
  Container,
  Flex,
  Box,
  Link,
  Select,
  Input,
  Table,
  Thead,
  Tbody,
  Tr,
  Th,
  Td,
  Button,
} from '@chakra-ui/react';

export const Tfelvetel = () => {
return (
<Container mt={4}>
        <Box>
          <h1>Tárgyak felvétele</h1>

          <Flex mt={4}>
            <Box flex={1} mr={4}>
              <label htmlFor="filterSemester">Félév szűrés</label>
              <Select id="filterSemester" defaultValue="">
                <option value="">Összes félév</option>
                <option value="1">1. félév</option>
                <option value="2">2. félév</option>
                <option value="3">3. félév</option>
                <option value="4">4. félév</option>
              </Select>
            </Box>
            <Box flex={1} mr={4}>
              <label htmlFor="filterName">Név szűrés</label>
              <Input type="text" id="filterName" />
            </Box>
            <Box flex={1}>
              <label htmlFor="filterCode">Kód szűrés</label>
              <Input type="text" id="filterCode" />
            </Box>
          </Flex>

          <Table mt={4}>
            <Thead>
              <Tr>
                <Th>Tárgy neve</Th>
                <Th>Tárgy kódja</Th>
                <Th>Ajánlott félév</Th>
                <Th>Tárgy kredit</Th>
                <Th>Tárgytípus</Th>
                <Th></Th>
              </Tr>
            </Thead>
            <Tbody>
              <Tr>
                <Td>Tárgy neve 1</Td>
                <Td>ABC123</Td>
                <Td>2. félév</Td>
                <Td>4</Td>
                <Td>Kötelező</Td>
                <Td>
                  <Button colorScheme="blue">Felvétel</Button>
                </Td>
              </Tr>
              <Tr>
                <Td>Tárgy neve 2</Td>
                <Td>DEF456</Td>
                <Td>3. félév</Td>
                <Td>5</Td>
                <Td>Választható</Td>
                <Td>
                  <Button colorScheme="blue">Felvétel</Button>
                </Td>
              </Tr>
              <Tr>
                <Td>Tárgy neve 3</Td>
                <Td>GHI789</Td>
                <Td>1. félév</Td>
                <Td>3</Td>
                <Td>Kötelező</Td>
                <Td>
                  <Button colorScheme="blue">Felvétel</Button>
                </Td>
              </Tr>
            </Tbody>
          </Table>
        </Box>
      </Container>
);
};

export default Tfelvetel;