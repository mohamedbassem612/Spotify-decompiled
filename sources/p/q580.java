package p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q580 implements InvocationHandler {
    public final Runnable a;

    public q580(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        AtomicBoolean atomicBoolean;
        Method methodA;
        AtomicBoolean atomicBoolean2;
        Set set = dhn.a;
        if (!set.contains(this)) {
            try {
                if (u890.j(method.getName(), "onBillingSetupFinished")) {
                    Object objN0 = objArr != null ? f46.n0(0, objArr) : null;
                    Class clsX = c680.x("com.android.billingclient.api.BillingResult");
                    if (clsX != null && (methodA = c680.A(clsX, "getResponseCode", new Class[0])) != null && u890.j(c680.B(clsX, objN0, methodA, new Object[0]), 0)) {
                        dgb dgbVar = u580.l;
                        if (set.contains(u580.class)) {
                            atomicBoolean2 = null;
                        } else {
                            try {
                                atomicBoolean2 = u580.n;
                            } catch (Throwable th) {
                                dhn.a(u580.class, th);
                                atomicBoolean2 = null;
                            }
                        }
                        atomicBoolean2.set(true);
                        this.a.run();
                    }
                } else if (nhc1.R(method.getName(), "onBillingServiceDisconnected", false)) {
                    dgb dgbVar2 = u580.l;
                    if (set.contains(u580.class)) {
                        atomicBoolean = null;
                    } else {
                        try {
                            atomicBoolean = u580.n;
                        } catch (Throwable th2) {
                            dhn.a(u580.class, th2);
                            atomicBoolean = null;
                        }
                    }
                    atomicBoolean.set(false);
                }
            } catch (Throwable th3) {
                dhn.a(this, th3);
                return null;
            }
        }
        return null;
    }
}
