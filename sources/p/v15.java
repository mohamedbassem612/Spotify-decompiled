package p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class v15 implements b6a1 {
    public static final rtw0 e = new rtw0((byte) 10);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public v15(Class cls) throws NoSuchMethodException {
        this.a = cls;
        this.b = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p.b6a1
    public final boolean a() {
        boolean z = gx4.e;
        return fj30.D();
    }

    @Override // p.b6a1
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // p.b6a1
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, nne.a);
                }
            } catch (IllegalAccessException e2) {
                eg.f(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !u890.j(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    eg.f(e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // p.b6a1
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                nct0 nct0Var = nct0.a;
                method.invoke(sSLSocket, rtw0.z(list));
            } catch (IllegalAccessException e2) {
                eg.f(e2);
            } catch (InvocationTargetException e3) {
                eg.f(e3);
            }
        }
    }
}
