package p;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fc31 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ gc31 c;

    public fc31(gc31 gc31Var, Class cls) {
        this.c = gc31Var;
        this.b = cls;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x006a A[SYNTHETIC] */
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        g370 g370VarB;
        Object obj2;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        kuw0 kuw0Var = oct0.b;
        if (kuw0Var.i(method)) {
            return kuw0Var.h(cls, obj, method, objArr2);
        }
        gc31 gc31Var = this.c;
        while (true) {
            Object objPutIfAbsent = gc31Var.a.get(method);
            if (!(objPutIfAbsent instanceof g370)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = gc31Var.a.get(method);
                        if (obj2 == null) {
                            g370VarB = (g370) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = gc31Var.a.putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = gc31Var.a.get(method);
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                g370VarB = (g370) obj2;
                                break;
                            }
                            try {
                                g370VarB = g370.b(gc31Var, cls, method);
                                gc31Var.a.put(method, g370VarB);
                                break;
                            } catch (Throwable th2) {
                                gc31Var.a.remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                g370VarB = (g370) objPutIfAbsent;
                break;
            }
        }
        return g370VarB.a(new wyp0(g370VarB.a, obj, objArr2, g370VarB.b, g370VarB.c), objArr2);
    }
}
