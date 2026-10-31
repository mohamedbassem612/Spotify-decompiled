package p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r580 implements InvocationHandler {
    public final b680 a;
    public final Runnable b;
    public final /* synthetic */ u580 c;

    public r580(u580 u580Var, b680 b680Var, Runnable runnable) {
        this.c = u580Var;
        this.a = b680Var;
        this.b = runnable;
    }

    public final void a(Method method, Object[] objArr) {
        b680 b680Var;
        u580 u580Var;
        Class cls;
        Method method2;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            if (u890.j(method.getName(), "onPurchaseHistoryResponse")) {
                Object objN0 = objArr != null ? f46.n0(1, objArr) : null;
                if (objN0 != null && (objN0 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objN0).iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        b680Var = this.a;
                        u580Var = this.c;
                        if (!zHasNext) {
                            break;
                        }
                        Object next = it.next();
                        try {
                            if (dhn.a.contains(u580.class)) {
                                cls = null;
                            } else {
                                try {
                                    cls = u580Var.d;
                                } catch (Throwable th) {
                                    dhn.a(u580.class, th);
                                    cls = null;
                                }
                            }
                            if (dhn.a.contains(u580.class)) {
                                method2 = null;
                            } else {
                                try {
                                    method2 = u580Var.h;
                                } catch (Throwable th2) {
                                    dhn.a(u580.class, th2);
                                    method2 = null;
                                }
                            }
                            Object objB = c680.B(cls, next, method2, new Object[0]);
                            String str = objB instanceof String ? (String) objB : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    arrayList.add(string);
                                    if (b680Var == b680.INAPP) {
                                        u580.b().put(string, jSONObject);
                                    } else {
                                        u580.d().put(string, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    Runnable runnable = this.b;
                    if (zIsEmpty) {
                        runnable.run();
                        return;
                    }
                    Set set = dhn.a;
                    if (set.contains(u580.class)) {
                        return;
                    }
                    try {
                        if (!set.contains(u580Var)) {
                            try {
                                u580Var.f(new m2d((Object) u580Var, (Object) runnable, (Object) b680Var, (Object) arrayList, (byte) 6));
                            } catch (Throwable th3) {
                                dhn.a(u580Var, th3);
                            }
                        }
                    } catch (Throwable th4) {
                        dhn.a(u580.class, th4);
                    }
                }
            }
        } catch (Throwable th5) {
            dhn.a(this, th5);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
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
    }
}
