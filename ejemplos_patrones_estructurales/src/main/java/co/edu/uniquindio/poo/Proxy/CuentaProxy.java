package co.edu.uniquindio.poo.Proxy;

import java.util.logging.Logger;

public class CuentaProxy implements ICuenta {

    private ICuenta cuentaReal;
    private final static Logger LOGGER = Logger.getLogger(CuentaProxy.class.getName());

    public CuentaProxy(ICuenta cuentaReal) {
        this.cuentaReal = cuentaReal;
    }
    
    @Override
    public Cuenta retirarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Retirar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoImplA();
            return cuentaReal.retirarDinero(cuenta, monto);
        } else {
            return cuentaReal.retirarDinero(cuenta, monto);
        }
    }

    @Override
    public Cuenta depositarDinero(Cuenta cuenta, double monto) {
        LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoImplA();
            return cuentaReal.depositarDinero(cuenta, monto);
        } else {
            return cuentaReal.depositarDinero(cuenta, monto);
        }
    }

    @Override
    public void mostrarSaldo(Cuenta cuenta) {
        LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
        if (cuentaReal == null) {
            cuentaReal = new CuentaBancoImplA();
            cuentaReal.mostrarSaldo(cuenta);
        } else {
            cuentaReal.mostrarSaldo(cuenta);
        }
    }

}


   