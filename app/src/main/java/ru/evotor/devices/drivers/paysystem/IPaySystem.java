package ru.evotor.devices.drivers.paysystem;

public interface IPaySystem {

    PayResult payment(PayInfo payInfo);

    PayResult cancelPayment(PayInfo payInfo, String rrn);

    PayResult payback(PayInfo payInfo, String rrn);

    PayResult cancelPayback(PayInfo payInfo, String rrn);

    PayResult closeSession();

    void openServiceMenu();

    String getBankName();

    int getTerminalNumber();

    String getTerminalID();

    String getMerchNumber();

    String getMerchCategoryCode();

    String getMerchEngName();

    String getCashier();

    String getServerIP();

}
