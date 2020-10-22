package com.northland.service.Impl;

import com.northland.dao.IBC_JIT_PickMasterDao;
import com.northland.domain.BC_JIT_PickMaster;
import com.northland.service.IBC_JIT_PickMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BC_JIT_PickMasterServiceImpl implements IBC_JIT_PickMasterService {

    @Autowired
    private IBC_JIT_PickMasterDao ibc_jit_pickMasterDao;

    @Override
    public List<BC_JIT_PickMaster> findAllBySDSalShipMasterBillNo(String SDSalShipMasterBillNo) throws Exception {
        return ibc_jit_pickMasterDao.findAllBySDSalShipMasterBillNo(SDSalShipMasterBillNo);
    }

    @Override
    public List<BC_JIT_PickMaster> findAll() {
        return ibc_jit_pickMasterDao.findAll();
    }

    @Override
    public BC_JIT_PickMaster findBySD(String sdSalShipMasterBillNo) {
        return ibc_jit_pickMasterDao.findBySD(sdSalShipMasterBillNo);
    }

    @Override
    public void update(String sdSalShipMasterBillNo, String pick_no, String buyer_address) {
        ibc_jit_pickMasterDao.update(sdSalShipMasterBillNo,pick_no,buyer_address);
    }

    @Override
    public void updateSDMRM(String sdSalShipMasterBillNo, String buyer_address) {
        ibc_jit_pickMasterDao.updateSDMRM(sdSalShipMasterBillNo,buyer_address);
    }
}
