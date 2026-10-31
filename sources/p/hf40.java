package p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hf40 {
    public final t8 a;
    public final Object b;
    public final t8 c;
    public final ff40 d;
    public final Method e;

    public hf40(t8 t8Var, Object obj, t8 t8Var2, ff40 ff40Var, Class cls) {
        if (t8Var == null) {
            hhg1.n("Null containingTypeDefaultInstance");
            throw null;
        }
        if (ff40Var.b == lul1.f && t8Var2 == null) {
            hhg1.n("Null messageDefaultInstance");
            throw null;
        }
        this.a = t8Var;
        this.b = obj;
        this.c = t8Var2;
        this.d = ff40Var;
        if (!w190.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            bhn0.o(l1d.q(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
            throw null;
        }
    }

    public final Object a(Object obj) {
        if (this.d.b.a != oul1.ENUM) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            bhn0.o("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            bhn0.o("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public final Object b(Object obj) {
        return this.d.b.a == oul1.ENUM ? Integer.valueOf(((w190) obj).getNumber()) : obj;
    }
}
