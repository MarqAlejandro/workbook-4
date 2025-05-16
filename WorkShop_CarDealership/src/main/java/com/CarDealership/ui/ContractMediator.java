package com.CarDealership.ui;

import com.CarDealership.contract.ContractFileManager;
import com.CarDealership.contract.SalesContract;

public class ContractMediator {

    public static SalesContract displayAndReturnSaleContract(){
            SalesContract salesContract = ContractPrompter.getSaleContract();
            ContractFileManager.saveSaleContractData(salesContract);

            return salesContract;

    }

    //working on lease contract later make sure sale contract works first
}
