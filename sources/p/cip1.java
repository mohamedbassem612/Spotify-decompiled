package p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cip1 extends qgp1 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected ubn1 zzc;

    public cip1() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = ubn1.e;
    }

    public static cip1 g(Class cls) {
        Map map = zzd;
        cip1 cip1Var = (cip1) map.get(cls);
        if (cip1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                cip1Var = (cip1) map.get(cls);
            } catch (ClassNotFoundException e) {
                k220.p("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (cip1Var != null) {
            return cip1Var;
        }
        try {
            cip1 cip1Var2 = (cip1) ((cip1) dcn1.a.allocateInstance(cls)).j(6, null);
            if (cip1Var2 != null) {
                map.put(cls, cip1Var2);
                return cip1Var2;
            }
            bhn0.w();
            return null;
        } catch (InstantiationException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    public static void h(Class cls, cip1 cip1Var) {
        cip1Var.l();
        zzd.put(cls, cip1Var);
    }

    public static Object i(Method method, cip1 cip1Var, Object... objArr) {
        try {
            return method.invoke(cip1Var, objArr);
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

    @Override // p.qgp1
    public final int a() {
        if (k()) {
            int iG = qjp1.c.a(getClass()).g(this);
            if (iG >= 0) {
                return iG;
            }
            x4n1.b(String.valueOf(iG).length() + 42, iG);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iG2 = qjp1.c.a(getClass()).g(this);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        x4n1.b(String.valueOf(iG2).length() + 42, iG2);
        return 0;
    }

    @Override // p.qgp1
    public final int c(ujp1 ujp1Var) {
        if (k()) {
            int iG = ujp1Var.g(this);
            if (iG >= 0) {
                return iG;
            }
            x4n1.b(String.valueOf(iG).length() + 42, iG);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iG2 = ujp1Var.g(this);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        x4n1.b(String.valueOf(iG2).length() + 42, iG2);
        return 0;
    }

    public final yhp1 e() {
        return (yhp1) j(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return qjp1.c.a(getClass()).b(this, (cip1) obj);
    }

    public final void f() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (k()) {
            return qjp1.c.a(getClass()).d(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iD = qjp1.c.a(getClass()).d(this);
        this.zza = iD;
        return iD;
    }

    public abstract Object j(int i, cip1 cip1Var);

    public final boolean k() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void l() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = jjp1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        jjp1.b(this, sb, 0);
        return sb.toString();
    }
}
