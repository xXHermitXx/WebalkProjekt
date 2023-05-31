import React from "react";
import { Box, Flex, Input, Select } from "@chakra-ui/react";

const Filters = () => {
  return (
    <Box mt={4} ml={5}>
      <h1>Tárgyak felvétele</h1>

      <Flex  align="center" mt={4}>
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
          <label htmlFor="filterName">Tárgy név szűrés</label>
          <Input type="text" id="filterName" />
        </Box>
        <Box flex={1}>
          <label htmlFor="filterCode">Tárgy kód szűrés</label>
          <Input type="text" id="filterCode" />
        </Box>
      </Flex>
    </Box>
  );
};

export default Filters;