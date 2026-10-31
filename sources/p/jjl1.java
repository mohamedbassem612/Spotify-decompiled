package p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jjl1 {
    public static final qjl1 a;

    static {
        lxh1 b610Var;
        try {
            InvocationHandler invocationHandlerN = hr80.n();
            b610Var = new lxh1((WebViewProviderFactoryBoundaryInterface) (invocationHandlerN == null ? null : WebViewProviderFactoryBoundaryInterface.class.cast(Proxy.newProxyInstance(t0c.class.getClassLoader(), new Class[]{WebViewProviderFactoryBoundaryInterface.class}, invocationHandlerN))), (byte) 9);
        } catch (ClassNotFoundException unused) {
            b610Var = new b610((byte) 5);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            eg.j(e);
            return;
        }
        a = b610Var;
    }
}
