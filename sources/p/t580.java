package p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t580 implements InvocationHandler {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ p580 c;

    public /* synthetic */ t580(p580 p580Var, Object obj, byte b) {
        this.a = b;
        this.c = p580Var;
        this.b = obj;
    }

    public void a(Method method, Object[] objArr) {
        Class cls;
        Method method2;
        u580 u580Var = (u580) this.c;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (u890.j(method.getName(), "onSkuDetailsResponse")) {
                Object objN0 = objArr != null ? f46.n0(1, objArr) : null;
                if (objN0 != null && (objN0 instanceof List)) {
                    for (Object obj : (List) objN0) {
                        try {
                            if (dhn.a.contains(u580.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = u580Var.c;
                                } catch (Throwable th) {
                                    dhn.a(u580.class, th);
                                    cls = null;
                                }
                            }
                            if (dhn.a.contains(u580.class)) {
                                method2 = null;
                            } else {
                                try {
                                    method2 = u580Var.g;
                                } catch (Throwable th2) {
                                    dhn.a(u580.class, th2);
                                    method2 = null;
                                }
                            }
                            Object objB = c680.B(cls, obj, method2, new Object[0]);
                            String str = objB instanceof String ? (String) objB : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    u580.c().put(jSONObject.getString("productId"), jSONObject);
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    ((Runnable) this.b).run();
                }
            }
        } catch (Throwable th3) {
            dhn.a(this, th3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        switch (this.a) {
            case 0:
                if (dhn.a.contains(this)) {
                    return null;
                }
                try {
                    a(method, objArr);
                    return rih1.a;
                } catch (Throwable th) {
                    dhn.a(this, th);
                    return null;
                }
            default:
                Object[] objArr2 = (Object[]) this.b;
                v580 v580Var = (v580) this.c;
                String name = method.getName();
                if (name != null) {
                    switch (name.hashCode()) {
                        case -1642587947:
                            if (name.equals("onPurchaseHistoryResponse") && !dhn.a.contains(v580.class)) {
                                try {
                                    v580Var.j(objArr2, objArr);
                                } catch (Throwable th2) {
                                    dhn.a(v580.class, th2);
                                }
                            }
                            break;
                        case -1599362358:
                            if (name.equals("onQueryPurchasesResponse") && !dhn.a.contains(v580.class)) {
                                try {
                                    v580Var.k(objArr2, objArr);
                                } catch (Throwable th3) {
                                    dhn.a(v580.class, th3);
                                }
                            }
                            break;
                        case -79406125:
                            if (name.equals("onBillingSetupFinished") && !dhn.a.contains(v580.class)) {
                                try {
                                    v580Var.h(objArr2, objArr);
                                } catch (Throwable th4) {
                                    dhn.a(v580.class, th4);
                                }
                            }
                            break;
                        case 1227540564:
                            if (name.equals("onBillingServiceDisconnected")) {
                                Set set = dhn.a;
                                if (!set.contains(v580.class)) {
                                    try {
                                        if (!set.contains(v580Var)) {
                                            try {
                                                v580.H.set(false);
                                            } catch (Throwable th5) {
                                                dhn.a(v580Var, th5);
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        dhn.a(v580.class, th6);
                                    }
                                }
                            }
                            break;
                        case 1940131955:
                            if (name.equals("onProductDetailsResponse") && !dhn.a.contains(v580.class)) {
                                try {
                                    v580Var.i(objArr2, objArr);
                                } catch (Throwable th7) {
                                    dhn.a(v580.class, th7);
                                }
                            }
                            break;
                    }
                }
                return null;
        }
    }
}
