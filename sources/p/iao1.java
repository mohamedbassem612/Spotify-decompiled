package p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class iao1 extends o3o1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected cjo1 zzc;
    private int zzd;

    public iao1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = cjo1.f;
    }

    public static void f(Class cls, iao1 iao1Var) {
        iao1Var.e();
        zzb.put(cls, iao1Var);
    }

    public static final boolean i(iao1 iao1Var, boolean z) {
        byte bByteValue = ((Byte) iao1Var.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = igo1.c.a(iao1Var.getClass()).b(iao1Var);
        if (z) {
            iao1Var.j(2);
        }
        return zB;
    }

    public static iao1 m(Class cls) {
        Map map = zzb;
        iao1 iao1Var = (iao1) map.get(cls);
        if (iao1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                iao1Var = (iao1) map.get(cls);
            } catch (ClassNotFoundException e) {
                k220.p("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (iao1Var != null) {
            return iao1Var;
        }
        try {
            iao1 iao1Var2 = (iao1) ((iao1) zjo1.a.allocateInstance(cls)).j(6);
            if (iao1Var2 != null) {
                map.put(cls, iao1Var2);
                return iao1Var2;
            }
            bhn0.w();
            return null;
        } catch (InstantiationException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    public static Object o(Method method, iao1 iao1Var, Object... objArr) {
        try {
            return method.invoke(iao1Var, objArr);
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

    @Override // p.o3o1
    public final void a(x6o1 x6o1Var) {
        sgo1 sgo1VarA = igo1.c.a(getClass());
        qeh1 qeh1Var = x6o1Var.a;
        if (qeh1Var == null) {
            qeh1Var = new qeh1(x6o1Var);
        }
        sgo1VarA.f(this, qeh1Var);
    }

    @Override // p.o3o1
    public final int c(sgo1 sgo1Var) {
        if (h()) {
            int iA = sgo1Var.a(this);
            if (iA >= 0) {
                return iA;
            }
            eg.m(f4i1.c(iA, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iA2 = sgo1Var.a(this);
        if (iA2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        eg.m(f4i1.c(iA2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // p.o3o1
    public final int d() {
        if (h()) {
            int iA = igo1.c.a(getClass()).a(this);
            if (iA >= 0) {
                return iA;
            }
            eg.m(f4i1.c(iA, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iA2 = igo1.c.a(getClass()).a(this);
        if (iA2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        eg.m(f4i1.c(iA2, "serialized size must be non-negative, was "));
        return 0;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return igo1.c.a(getClass()).d(this, (iao1) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return igo1.c.a(getClass()).c(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iC = igo1.c.a(getClass()).c(this);
        this.zza = iC;
        return iC;
    }

    public abstract Object j(int i);

    public final t9o1 k() {
        return (t9o1) j(5);
    }

    public final t9o1 l() {
        t9o1 t9o1Var = (t9o1) j(5);
        if (!t9o1Var.a.equals(this)) {
            if (!t9o1Var.b.h()) {
                iao1 iao1VarN = t9o1Var.a.n();
                igo1.c.a(iao1VarN.getClass()).zzg(iao1VarN, t9o1Var.b);
                t9o1Var.b = iao1VarN;
            }
            iao1 iao1Var = t9o1Var.b;
            igo1.c.a(iao1Var.getClass()).zzg(iao1Var, this);
        }
        return t9o1Var;
    }

    public final iao1 n() {
        return (iao1) j(4);
    }

    public final void p() {
        igo1.c.a(getClass()).zzf(this);
        e();
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = sfo1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        sfo1.c(this, sb, 0);
        return sb.toString();
    }
}
