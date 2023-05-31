import React from "react";
import { Button, Table, Tbody, Td, Th, Thead, Tr } from "@chakra-ui/react";

const DataTable = () => {
  return (
    <Table align="center" mt={4}>
      <Thead>
        <Tr>
          <Th>Tárgy neve</Th>
          <Th>Tárgy kódja</Th>
          <Th>Ajánlott félév</Th>
          <Th>kredit</Th>
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
  );
};

export default DataTable;