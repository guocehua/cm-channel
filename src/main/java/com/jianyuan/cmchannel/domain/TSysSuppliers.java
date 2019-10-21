package com.jianyuan.cmchannel.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSysSuppliers implements Serializable {
    /**
     * 代理商id
     */
    private String supId;

    /**
     * 代理商标识
     */
    private String supFlag;

    /**
     * 财务接口专用供应商编号对应原系统prov_id
     */
    private String supCode;

    /**
     * 代理商名称
     */
    private String supName;

    /**
     * 代理商简称
     */
    private String supShortname;

    /**
     * 厂商id,改为多对多，新加中间表t_sys_supp_company
     */
    private BigDecimal companyId;

    /**
     * 营业执照注册号
     */
    private String corpBusinessLicense;

    /**
     * 代理商地址
     */
    private String supAddress;

    /**
     * 代理商传真
     */
    private String supFax;

    /**
     * 代理商邮编
     */
    private String supZip;

    /**
     * 组织机构代码证号
     */
    private String oragnizationCode;

    /**
     * 税务登记号
     */
    private String taxCode;

    /**
     * 成立日期
     */
    private Date setupDate;

    /**
     * 到期日期
     */
    private Date periodValidity;

    /**
     * 注册资本
     */
    private BigDecimal registeCapital;

    /**
     * 实收资本
     */
    private BigDecimal paiclupCapital;

    /**
     * 经营范围
     */
    private String businessRange;

    /**
     * 代理商官网
     */
    private String supWebsite;

    /**
     * 代理商经理
     */
    private String supManager;

    /**
     * 所属行业
     */
    private String proIndustry;

    /**
     * 是否回购
     */
    private BigDecimal isRepo;

    /**
     * 区域id
     */
    private String areaId;

    /**
     * 省id
     */
    private String provId;

    /**
     * 城市id
     */
    private String cityId;

    /**
     * 业务协议书签订日
     */
    private Date signDate;

    /**
     * 代理商开户行
     */
    private String openBank;

    /**
     * 开户账号
     */
    private String openBankNumber;

    /**
     * 代理商法人名
     */
    private String supLegalName;

    /**
     * 代理商法人电话
     */
    private String supLegalPhone;

    /**
     * 代理商法人手机号
     */
    private String supLegalMobil;

    /**
     * 代理商法人常住地址
     */
    private String subLegalAddress;

    /**
     * 代理商法人email
     */
    private String subLegalEmail;

    /**
     * 开票地址
     */
    private String billAddress;

    /**
     * 开票电话
     */
    private String billPhone;

    /**
     * 纳税资质（一般纳税人、小规模）
     */
    private String taxQual;

    /**
     * 纳税人识别号
     */
    private String taxIdenNum;

    /**
     * 邮递接收人
     */
    private String emsToName;

    /**
     * 邮递接收地址
     */
    private String emsToAddress;

    /**
     * 邮递联系电话
     */
    private String emsToPhone;

    /**
     * 邮递邮编
     */
    private String emsToZip;

    /**
     * 自有账户单位名
     */
    private String loansOwnUnit;

    /**
     * 自有账户地址
     */
    private String loansOwnAddr;

    /**
     * 自有账户所在行
     */
    private String loansOwnBank;

    /**
     * 自有账户账号
     */
    private String loansOwnAccount;

    /**
     * 共有账户单位名
     */
    private String loansTotalUnit;

    /**
     * 共有账户地址
     */
    private String loansTotalAdddr;

    /**
     * 共有账户所在行
     */
    private String loansTotalBank;

    /**
     * 共有账户账号
     */
    private String loansTotalAccount;

    /**
     * 代理商评分
     */
    private BigDecimal subScore;

    /**
     * 档案编号
     */
    private String fileNumber;

    /**
     * 操作人id
     */
    private String userId;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 代理商等级
     */
    private String supLevel;

    /**
     * 代理商业务开关
     */
    private String supSwitch;

    /**
     * 代理商授信开关：是否进行额度流程管理（担保额度申请）
     */
    private String creditSwitch;

    /**
     * 代理商放款开关
     */
    private String paymentSwitch;

    /**
     * 是否允许差额放款开关
     */
    private String balanceLoanSwitch;

    /**
     * 是否开通季度内不规则还款开关
     */
    private String irregularRepaymentSwitch;

    /**
     * 是否开通b模式开关
     */
    private String bModelSwitch;

    /**
     * 使用状态(辅导期、正式期)
     */
    private String status;

    /**
     * 法人代表身份证号
     */
    private String supLegalIdcard;

    /**
     * 对应组织架构id(org_id)
     */
    private BigDecimal orgBmid;

    /**
     * 业务范围
     */
    private String scode;

    /**
     * 开户行所在地
     */
    private String openBankAddr;

    /**
     * t_sys_ems_info id
     */
    private String emsId;

    /**
     * 分期相关财务唯一标识对应原系统prov_instalment_id
     */
    private String provInstalmentId;

    /**
     * 作废
     */
    private String financeSupId;

    /**
     * 厂商放款全称
     */
    private String loansCompanyUnit;

    /**
     * 厂商放款地址
     */
    private String loansCompanyAddr;

    /**
     * 厂商放款银行
     */
    private String loansCompanyBank;

    /**
     * 厂商放款账号
     */
    private String loansCompanyAccount;

    /**
     * 短信业务是否开通开关
     */
    private String smsSwitch;

    /**
     * 授信状态  0初始授信 1标准授信  -1未授信
     */
    private BigDecimal creditStatus;

    /**
     * 是否开通扫描件开机动车票 1不开通 0开通
     */
    private String scanSwitch;

    /**
     * 资料补齐开关（100%）0开通 1不开通
     */
    private String datafillSwitch;

    /**
     * 信用等级
     */
    private String creditGrade;

    /**
     * 直租不上牌立项流程是否经过营业员审核步骤  0不经过 1经过
     */
    private BigDecimal yingyeStatus;

    /**
     * 代理商评分
     */
    private BigDecimal score;

    /**
     * 经销商类型：1：经销商，2：sp，3：经纪人，4：经销集团，5:指标公司，6：合作金融机构
     */
    private BigDecimal supType;

    /**
     * 父id
     */
    private String parentId;

    /**
     * 供应商放款方式，数据字典中配置1,票前放款2,上牌前放款3，抵押前放款4，抵押后放款，5：签约后放款
     */
    private String lendingType;

    /**
     * 返佣比率
     */
    private BigDecimal commissionRatio;

    /**
     * 返佣金额
     */
    private BigDecimal commissionAmount;

    /**
     * 常住地址（省）
     */
    private String subLegalProv;

    /**
     * 常住地址（市）
     */
    private String subLegalCity;

    /**
     * 常住地址（区）
     */
    private String subLegalArea;

    /**
     * 自有账户支付行号
     */
    private String loansOwnPay;

    /**
     * 共管账户支付行号
     */
    private String loansTotalPay;

    /**
     * 厂商账户支付行号
     */
    private String loansCompanyPay;

    /**
     * 区域经理
     */
    private String areaManager;

    /**
     * 区域经理id
     */
    private String areaManagerId;

    /**
     * 所属公司
     */
    private BigDecimal owncompany;

    /**
     * 区域经理id
     */
    private BigDecimal suppAreaId;

    /**
     * 区域经理名称
     */
    private String suppAreaJl;

    /**
     * 是否分账（1：不分账  2：分账）sup_type=6时候使用
     */
    private BigDecimal isRouting;

    /**
     * 商户代码，分账使用
     */
    private String merchantId;

    /**
     * gps供应商
     */
    private String gpsSupp;

    /**
     * 1 是 2 否
     */
    private String vip;

    /**
     * 光大经销商编码
     */
    private String gdSuppCode;

    /**
     * 光大经销商
     */
    private String gdSupp;

    /**
     * 是否为有风险渠道 2正常1 关注  0  高风险
     */
    private BigDecimal sfwyfxqd;

    /**
     * 是否阶段性担保fbd公司或车商(数据字典取值：是否阶段性担保fbd公司或车商)
     */
    private BigDecimal isStageDb;

    /**
     * 合作保险公司（光大模式会使用）
     */
    private BigDecimal insureId;

    /**
     * 文件邮送警告天数（超过这个天数，开始提醒业务员邮送邮件）
     */
    private BigDecimal warnDay;

    /**
     * 进单分流方式 1建元 0金融顾问，数据字典配置
     */
    private BigDecimal gotoType;

    /**
     * 钉钉部门id
     */
    private String ddId;

    /**
     * 渠道类型，数据字典配置fbd、经销商
     */
    private String supCate;

    /**
     * 前端是否可修改放款银行信息
     */
    private BigDecimal isLoansPay;

    /**
     * 企业负责人
     */
    private String companyLeader;

    /**
     * 联系方式
     */
    private String contactWay;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 企业地址（省）
     */
    private String companyProv;

    /**
     * 企业地址（市）
     */
    private String companyCity;

    /**
     * 企业地址（区）
     */
    private String companyArea;

    /**
     * 企业详细地址
     */
    private String companyAddress;

    /**
     * 放款时资金账户类型  1-公户 0-个人账户
     */
    private String accountProp;

    private static final long serialVersionUID = 1L;

    public String getSupId() {
        return supId;
    }

    public void setSupId(String supId) {
        this.supId = supId == null ? null : supId.trim();
    }

    public String getSupFlag() {
        return supFlag;
    }

    public void setSupFlag(String supFlag) {
        this.supFlag = supFlag == null ? null : supFlag.trim();
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode == null ? null : supCode.trim();
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName == null ? null : supName.trim();
    }

    public String getSupShortname() {
        return supShortname;
    }

    public void setSupShortname(String supShortname) {
        this.supShortname = supShortname == null ? null : supShortname.trim();
    }

    public BigDecimal getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
    }

    public String getCorpBusinessLicense() {
        return corpBusinessLicense;
    }

    public void setCorpBusinessLicense(String corpBusinessLicense) {
        this.corpBusinessLicense = corpBusinessLicense == null ? null : corpBusinessLicense.trim();
    }

    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress == null ? null : supAddress.trim();
    }

    public String getSupFax() {
        return supFax;
    }

    public void setSupFax(String supFax) {
        this.supFax = supFax == null ? null : supFax.trim();
    }

    public String getSupZip() {
        return supZip;
    }

    public void setSupZip(String supZip) {
        this.supZip = supZip == null ? null : supZip.trim();
    }

    public String getOragnizationCode() {
        return oragnizationCode;
    }

    public void setOragnizationCode(String oragnizationCode) {
        this.oragnizationCode = oragnizationCode == null ? null : oragnizationCode.trim();
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode == null ? null : taxCode.trim();
    }

    public Date getSetupDate() {
        return setupDate;
    }

    public void setSetupDate(Date setupDate) {
        this.setupDate = setupDate;
    }

    public Date getPeriodValidity() {
        return periodValidity;
    }

    public void setPeriodValidity(Date periodValidity) {
        this.periodValidity = periodValidity;
    }

    public BigDecimal getRegisteCapital() {
        return registeCapital;
    }

    public void setRegisteCapital(BigDecimal registeCapital) {
        this.registeCapital = registeCapital;
    }

    public BigDecimal getPaiclupCapital() {
        return paiclupCapital;
    }

    public void setPaiclupCapital(BigDecimal paiclupCapital) {
        this.paiclupCapital = paiclupCapital;
    }

    public String getBusinessRange() {
        return businessRange;
    }

    public void setBusinessRange(String businessRange) {
        this.businessRange = businessRange == null ? null : businessRange.trim();
    }

    public String getSupWebsite() {
        return supWebsite;
    }

    public void setSupWebsite(String supWebsite) {
        this.supWebsite = supWebsite == null ? null : supWebsite.trim();
    }

    public String getSupManager() {
        return supManager;
    }

    public void setSupManager(String supManager) {
        this.supManager = supManager == null ? null : supManager.trim();
    }

    public String getProIndustry() {
        return proIndustry;
    }

    public void setProIndustry(String proIndustry) {
        this.proIndustry = proIndustry == null ? null : proIndustry.trim();
    }

    public BigDecimal getIsRepo() {
        return isRepo;
    }

    public void setIsRepo(BigDecimal isRepo) {
        this.isRepo = isRepo;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId == null ? null : provId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getOpenBank() {
        return openBank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank == null ? null : openBank.trim();
    }

    public String getOpenBankNumber() {
        return openBankNumber;
    }

    public void setOpenBankNumber(String openBankNumber) {
        this.openBankNumber = openBankNumber == null ? null : openBankNumber.trim();
    }

    public String getSupLegalName() {
        return supLegalName;
    }

    public void setSupLegalName(String supLegalName) {
        this.supLegalName = supLegalName == null ? null : supLegalName.trim();
    }

    public String getSupLegalPhone() {
        return supLegalPhone;
    }

    public void setSupLegalPhone(String supLegalPhone) {
        this.supLegalPhone = supLegalPhone == null ? null : supLegalPhone.trim();
    }

    public String getSupLegalMobil() {
        return supLegalMobil;
    }

    public void setSupLegalMobil(String supLegalMobil) {
        this.supLegalMobil = supLegalMobil == null ? null : supLegalMobil.trim();
    }

    public String getSubLegalAddress() {
        return subLegalAddress;
    }

    public void setSubLegalAddress(String subLegalAddress) {
        this.subLegalAddress = subLegalAddress == null ? null : subLegalAddress.trim();
    }

    public String getSubLegalEmail() {
        return subLegalEmail;
    }

    public void setSubLegalEmail(String subLegalEmail) {
        this.subLegalEmail = subLegalEmail == null ? null : subLegalEmail.trim();
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress == null ? null : billAddress.trim();
    }

    public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String billPhone) {
        this.billPhone = billPhone == null ? null : billPhone.trim();
    }

    public String getTaxQual() {
        return taxQual;
    }

    public void setTaxQual(String taxQual) {
        this.taxQual = taxQual == null ? null : taxQual.trim();
    }

    public String getTaxIdenNum() {
        return taxIdenNum;
    }

    public void setTaxIdenNum(String taxIdenNum) {
        this.taxIdenNum = taxIdenNum == null ? null : taxIdenNum.trim();
    }

    public String getEmsToName() {
        return emsToName;
    }

    public void setEmsToName(String emsToName) {
        this.emsToName = emsToName == null ? null : emsToName.trim();
    }

    public String getEmsToAddress() {
        return emsToAddress;
    }

    public void setEmsToAddress(String emsToAddress) {
        this.emsToAddress = emsToAddress == null ? null : emsToAddress.trim();
    }

    public String getEmsToPhone() {
        return emsToPhone;
    }

    public void setEmsToPhone(String emsToPhone) {
        this.emsToPhone = emsToPhone == null ? null : emsToPhone.trim();
    }

    public String getEmsToZip() {
        return emsToZip;
    }

    public void setEmsToZip(String emsToZip) {
        this.emsToZip = emsToZip == null ? null : emsToZip.trim();
    }

    public String getLoansOwnUnit() {
        return loansOwnUnit;
    }

    public void setLoansOwnUnit(String loansOwnUnit) {
        this.loansOwnUnit = loansOwnUnit == null ? null : loansOwnUnit.trim();
    }

    public String getLoansOwnAddr() {
        return loansOwnAddr;
    }

    public void setLoansOwnAddr(String loansOwnAddr) {
        this.loansOwnAddr = loansOwnAddr == null ? null : loansOwnAddr.trim();
    }

    public String getLoansOwnBank() {
        return loansOwnBank;
    }

    public void setLoansOwnBank(String loansOwnBank) {
        this.loansOwnBank = loansOwnBank == null ? null : loansOwnBank.trim();
    }

    public String getLoansOwnAccount() {
        return loansOwnAccount;
    }

    public void setLoansOwnAccount(String loansOwnAccount) {
        this.loansOwnAccount = loansOwnAccount == null ? null : loansOwnAccount.trim();
    }

    public String getLoansTotalUnit() {
        return loansTotalUnit;
    }

    public void setLoansTotalUnit(String loansTotalUnit) {
        this.loansTotalUnit = loansTotalUnit == null ? null : loansTotalUnit.trim();
    }

    public String getLoansTotalAdddr() {
        return loansTotalAdddr;
    }

    public void setLoansTotalAdddr(String loansTotalAdddr) {
        this.loansTotalAdddr = loansTotalAdddr == null ? null : loansTotalAdddr.trim();
    }

    public String getLoansTotalBank() {
        return loansTotalBank;
    }

    public void setLoansTotalBank(String loansTotalBank) {
        this.loansTotalBank = loansTotalBank == null ? null : loansTotalBank.trim();
    }

    public String getLoansTotalAccount() {
        return loansTotalAccount;
    }

    public void setLoansTotalAccount(String loansTotalAccount) {
        this.loansTotalAccount = loansTotalAccount == null ? null : loansTotalAccount.trim();
    }

    public BigDecimal getSubScore() {
        return subScore;
    }

    public void setSubScore(BigDecimal subScore) {
        this.subScore = subScore;
    }

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber == null ? null : fileNumber.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSupLevel() {
        return supLevel;
    }

    public void setSupLevel(String supLevel) {
        this.supLevel = supLevel == null ? null : supLevel.trim();
    }

    public String getSupSwitch() {
        return supSwitch;
    }

    public void setSupSwitch(String supSwitch) {
        this.supSwitch = supSwitch == null ? null : supSwitch.trim();
    }

    public String getCreditSwitch() {
        return creditSwitch;
    }

    public void setCreditSwitch(String creditSwitch) {
        this.creditSwitch = creditSwitch == null ? null : creditSwitch.trim();
    }

    public String getPaymentSwitch() {
        return paymentSwitch;
    }

    public void setPaymentSwitch(String paymentSwitch) {
        this.paymentSwitch = paymentSwitch == null ? null : paymentSwitch.trim();
    }

    public String getBalanceLoanSwitch() {
        return balanceLoanSwitch;
    }

    public void setBalanceLoanSwitch(String balanceLoanSwitch) {
        this.balanceLoanSwitch = balanceLoanSwitch == null ? null : balanceLoanSwitch.trim();
    }

    public String getIrregularRepaymentSwitch() {
        return irregularRepaymentSwitch;
    }

    public void setIrregularRepaymentSwitch(String irregularRepaymentSwitch) {
        this.irregularRepaymentSwitch = irregularRepaymentSwitch == null ? null : irregularRepaymentSwitch.trim();
    }

    public String getbModelSwitch() {
        return bModelSwitch;
    }

    public void setbModelSwitch(String bModelSwitch) {
        this.bModelSwitch = bModelSwitch == null ? null : bModelSwitch.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSupLegalIdcard() {
        return supLegalIdcard;
    }

    public void setSupLegalIdcard(String supLegalIdcard) {
        this.supLegalIdcard = supLegalIdcard == null ? null : supLegalIdcard.trim();
    }

    public BigDecimal getOrgBmid() {
        return orgBmid;
    }

    public void setOrgBmid(BigDecimal orgBmid) {
        this.orgBmid = orgBmid;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode == null ? null : scode.trim();
    }

    public String getOpenBankAddr() {
        return openBankAddr;
    }

    public void setOpenBankAddr(String openBankAddr) {
        this.openBankAddr = openBankAddr == null ? null : openBankAddr.trim();
    }

    public String getEmsId() {
        return emsId;
    }

    public void setEmsId(String emsId) {
        this.emsId = emsId == null ? null : emsId.trim();
    }

    public String getProvInstalmentId() {
        return provInstalmentId;
    }

    public void setProvInstalmentId(String provInstalmentId) {
        this.provInstalmentId = provInstalmentId == null ? null : provInstalmentId.trim();
    }

    public String getFinanceSupId() {
        return financeSupId;
    }

    public void setFinanceSupId(String financeSupId) {
        this.financeSupId = financeSupId == null ? null : financeSupId.trim();
    }

    public String getLoansCompanyUnit() {
        return loansCompanyUnit;
    }

    public void setLoansCompanyUnit(String loansCompanyUnit) {
        this.loansCompanyUnit = loansCompanyUnit == null ? null : loansCompanyUnit.trim();
    }

    public String getLoansCompanyAddr() {
        return loansCompanyAddr;
    }

    public void setLoansCompanyAddr(String loansCompanyAddr) {
        this.loansCompanyAddr = loansCompanyAddr == null ? null : loansCompanyAddr.trim();
    }

    public String getLoansCompanyBank() {
        return loansCompanyBank;
    }

    public void setLoansCompanyBank(String loansCompanyBank) {
        this.loansCompanyBank = loansCompanyBank == null ? null : loansCompanyBank.trim();
    }

    public String getLoansCompanyAccount() {
        return loansCompanyAccount;
    }

    public void setLoansCompanyAccount(String loansCompanyAccount) {
        this.loansCompanyAccount = loansCompanyAccount == null ? null : loansCompanyAccount.trim();
    }

    public String getSmsSwitch() {
        return smsSwitch;
    }

    public void setSmsSwitch(String smsSwitch) {
        this.smsSwitch = smsSwitch == null ? null : smsSwitch.trim();
    }

    public BigDecimal getCreditStatus() {
        return creditStatus;
    }

    public void setCreditStatus(BigDecimal creditStatus) {
        this.creditStatus = creditStatus;
    }

    public String getScanSwitch() {
        return scanSwitch;
    }

    public void setScanSwitch(String scanSwitch) {
        this.scanSwitch = scanSwitch == null ? null : scanSwitch.trim();
    }

    public String getDatafillSwitch() {
        return datafillSwitch;
    }

    public void setDatafillSwitch(String datafillSwitch) {
        this.datafillSwitch = datafillSwitch == null ? null : datafillSwitch.trim();
    }

    public String getCreditGrade() {
        return creditGrade;
    }

    public void setCreditGrade(String creditGrade) {
        this.creditGrade = creditGrade == null ? null : creditGrade.trim();
    }

    public BigDecimal getYingyeStatus() {
        return yingyeStatus;
    }

    public void setYingyeStatus(BigDecimal yingyeStatus) {
        this.yingyeStatus = yingyeStatus;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public BigDecimal getSupType() {
        return supType;
    }

    public void setSupType(BigDecimal supType) {
        this.supType = supType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getLendingType() {
        return lendingType;
    }

    public void setLendingType(String lendingType) {
        this.lendingType = lendingType == null ? null : lendingType.trim();
    }

    public BigDecimal getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(BigDecimal commissionRatio) {
        this.commissionRatio = commissionRatio;
    }

    public BigDecimal getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(BigDecimal commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getSubLegalProv() {
        return subLegalProv;
    }

    public void setSubLegalProv(String subLegalProv) {
        this.subLegalProv = subLegalProv == null ? null : subLegalProv.trim();
    }

    public String getSubLegalCity() {
        return subLegalCity;
    }

    public void setSubLegalCity(String subLegalCity) {
        this.subLegalCity = subLegalCity == null ? null : subLegalCity.trim();
    }

    public String getSubLegalArea() {
        return subLegalArea;
    }

    public void setSubLegalArea(String subLegalArea) {
        this.subLegalArea = subLegalArea == null ? null : subLegalArea.trim();
    }

    public String getLoansOwnPay() {
        return loansOwnPay;
    }

    public void setLoansOwnPay(String loansOwnPay) {
        this.loansOwnPay = loansOwnPay == null ? null : loansOwnPay.trim();
    }

    public String getLoansTotalPay() {
        return loansTotalPay;
    }

    public void setLoansTotalPay(String loansTotalPay) {
        this.loansTotalPay = loansTotalPay == null ? null : loansTotalPay.trim();
    }

    public String getLoansCompanyPay() {
        return loansCompanyPay;
    }

    public void setLoansCompanyPay(String loansCompanyPay) {
        this.loansCompanyPay = loansCompanyPay == null ? null : loansCompanyPay.trim();
    }

    public String getAreaManager() {
        return areaManager;
    }

    public void setAreaManager(String areaManager) {
        this.areaManager = areaManager == null ? null : areaManager.trim();
    }

    public String getAreaManagerId() {
        return areaManagerId;
    }

    public void setAreaManagerId(String areaManagerId) {
        this.areaManagerId = areaManagerId == null ? null : areaManagerId.trim();
    }

    public BigDecimal getOwncompany() {
        return owncompany;
    }

    public void setOwncompany(BigDecimal owncompany) {
        this.owncompany = owncompany;
    }

    public BigDecimal getSuppAreaId() {
        return suppAreaId;
    }

    public void setSuppAreaId(BigDecimal suppAreaId) {
        this.suppAreaId = suppAreaId;
    }

    public String getSuppAreaJl() {
        return suppAreaJl;
    }

    public void setSuppAreaJl(String suppAreaJl) {
        this.suppAreaJl = suppAreaJl == null ? null : suppAreaJl.trim();
    }

    public BigDecimal getIsRouting() {
        return isRouting;
    }

    public void setIsRouting(BigDecimal isRouting) {
        this.isRouting = isRouting;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId == null ? null : merchantId.trim();
    }

    public String getGpsSupp() {
        return gpsSupp;
    }

    public void setGpsSupp(String gpsSupp) {
        this.gpsSupp = gpsSupp == null ? null : gpsSupp.trim();
    }

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip == null ? null : vip.trim();
    }

    public String getGdSuppCode() {
        return gdSuppCode;
    }

    public void setGdSuppCode(String gdSuppCode) {
        this.gdSuppCode = gdSuppCode == null ? null : gdSuppCode.trim();
    }

    public String getGdSupp() {
        return gdSupp;
    }

    public void setGdSupp(String gdSupp) {
        this.gdSupp = gdSupp == null ? null : gdSupp.trim();
    }

    public BigDecimal getSfwyfxqd() {
        return sfwyfxqd;
    }

    public void setSfwyfxqd(BigDecimal sfwyfxqd) {
        this.sfwyfxqd = sfwyfxqd;
    }

    public BigDecimal getIsStageDb() {
        return isStageDb;
    }

    public void setIsStageDb(BigDecimal isStageDb) {
        this.isStageDb = isStageDb;
    }

    public BigDecimal getInsureId() {
        return insureId;
    }

    public void setInsureId(BigDecimal insureId) {
        this.insureId = insureId;
    }

    public BigDecimal getWarnDay() {
        return warnDay;
    }

    public void setWarnDay(BigDecimal warnDay) {
        this.warnDay = warnDay;
    }

    public BigDecimal getGotoType() {
        return gotoType;
    }

    public void setGotoType(BigDecimal gotoType) {
        this.gotoType = gotoType;
    }

    public String getDdId() {
        return ddId;
    }

    public void setDdId(String ddId) {
        this.ddId = ddId == null ? null : ddId.trim();
    }

    public String getSupCate() {
        return supCate;
    }

    public void setSupCate(String supCate) {
        this.supCate = supCate == null ? null : supCate.trim();
    }

    public BigDecimal getIsLoansPay() {
        return isLoansPay;
    }

    public void setIsLoansPay(BigDecimal isLoansPay) {
        this.isLoansPay = isLoansPay;
    }

    public String getCompanyLeader() {
        return companyLeader;
    }

    public void setCompanyLeader(String companyLeader) {
        this.companyLeader = companyLeader == null ? null : companyLeader.trim();
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay == null ? null : contactWay.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getCompanyProv() {
        return companyProv;
    }

    public void setCompanyProv(String companyProv) {
        this.companyProv = companyProv == null ? null : companyProv.trim();
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity == null ? null : companyCity.trim();
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea == null ? null : companyArea.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getAccountProp() {
        return accountProp;
    }

    public void setAccountProp(String accountProp) {
        this.accountProp = accountProp == null ? null : accountProp.trim();
    }
}