import React from "react"
import Header from "./Components/header";
import Filters from "./Components/filters";
import DataTable from "./Components/table";
import {Container} from "@chakra-ui/react";


export const App = () => (
  <>
  <Header />
    <Filters />
    <DataTable />
  </>
)
