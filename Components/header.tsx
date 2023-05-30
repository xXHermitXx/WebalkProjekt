import React from "react";
import { Box, Container, Flex, Link} from "@chakra-ui/react";

const Header = () => {
  return (
    <Box bg="gray.900" py={4}>
      <Container ml={5}>
        <Flex align="Center" justify="flex-start">
          <Link color="white" fontSize="xl" fontWeight="bold" href="#">
            Egyetemi Honlap
          </Link>
          <Flex ml={4}>
            <Link color="white" mr={4} href="#">
              Kezdőlap
            </Link>
            <Link color="white" mr={4} href="#">
              Tárgyak
            </Link>
            <Link color="white" href="#">
              Profil
            </Link>
          </Flex>
        </Flex>
      </Container>
    </Box>
  );
};

export default Header;