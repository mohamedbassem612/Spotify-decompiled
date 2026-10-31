package p;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yb11 extends ub11 {
    public final Object a;

    public yb11(Object obj) {
        this.a = obj;
    }

    @Override // p.ub11
    public final Member b() {
        ye90 ye90Var = jo31.c;
        Object obj = this.a;
        if (ye90Var == null) {
            Class<?> cls = obj.getClass();
            try {
                ye90Var = new ye90(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), (byte) 5);
            } catch (NoSuchMethodException unused) {
                ye90Var = new ye90((Object) null, (Object) null, (byte) 5);
            }
            jo31.c = ye90Var;
        }
        Method method = (Method) ye90Var.c;
        Method method2 = method != null ? (Method) method.invoke(obj, null) : null;
        if (method2 != null) {
            return method2;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final zb11 f() {
        ye90 ye90Var = jo31.c;
        Object obj = this.a;
        if (ye90Var == null) {
            Class<?> cls = obj.getClass();
            try {
                ye90Var = new ye90(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), (byte) 5);
            } catch (NoSuchMethodException unused) {
                ye90Var = new ye90((Object) null, (Object) null, (byte) 5);
            }
            jo31.c = ye90Var;
        }
        Method method = (Method) ye90Var.b;
        Class cls2 = method != null ? (Class) method.invoke(obj, null) : null;
        if (cls2 != null) {
            return new ob11(cls2);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
