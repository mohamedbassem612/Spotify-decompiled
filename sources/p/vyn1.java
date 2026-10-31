package p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vyn1 extends qrn1 {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected n8o1 zzc;

    public vyn1() {
        ((qrn1) this).zza = 0;
        this.zzb = -1;
        this.zzc = n8o1.f;
    }

    public static vyn1 i(Class cls) {
        Map map = zze;
        vyn1 vyn1Var = (vyn1) map.get(cls);
        if (vyn1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vyn1Var = (vyn1) map.get(cls);
            } catch (ClassNotFoundException e) {
                k220.p("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (vyn1Var != null) {
            return vyn1Var;
        }
        try {
            vyn1 vyn1Var2 = (vyn1) ((vyn1) n9o1.a.allocateInstance(cls)).b(6, null);
            if (vyn1Var2 != null) {
                map.put(cls, vyn1Var2);
                return vyn1Var2;
            }
            bhn0.w();
            return null;
        } catch (InstantiationException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    public static void j(Class cls, vyn1 vyn1Var) {
        vyn1Var.d();
        zze.put(cls, vyn1Var);
    }

    public static Object k(Method method, vyn1 vyn1Var, Object... objArr) {
        try {
            return method.invoke(vyn1Var, objArr);
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

    public static final boolean m(vyn1 vyn1Var, boolean z) {
        byte bByteValue = ((Byte) vyn1Var.b(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = w5o1.c.b(vyn1Var.getClass()).zzl(vyn1Var);
        if (z) {
            vyn1Var.b(2, true == zZzl ? vyn1Var : null);
        }
        return zZzl;
    }

    public final int a(r6o1 r6o1Var) {
        if (c()) {
            int iG = r6o1Var.g(this);
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
        int iG2 = r6o1Var.g(this);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        x4n1.b(String.valueOf(iG2).length() + 42, iG2);
        return 0;
    }

    public abstract Object b(int i, vyn1 vyn1Var);

    public final boolean c() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final void d() {
        this.zzb &= Integer.MAX_VALUE;
    }

    public final vyn1 e() {
        return (vyn1) b(4, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return w5o1.c.b(getClass()).e(this, (vyn1) obj);
    }

    public final void f() {
        w5o1.c.b(getClass()).b(this);
        d();
    }

    public final void g() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final int h() {
        if (c()) {
            int iG = w5o1.c.b(getClass()).g(this);
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
        int iG2 = w5o1.c.b(getClass()).g(this);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        x4n1.b(String.valueOf(iG2).length() + 42, iG2);
        return 0;
    }

    public final int hashCode() {
        if (c()) {
            return w5o1.c.b(getClass()).d(this);
        }
        int i = ((qrn1) this).zza;
        if (i != 0) {
            return i;
        }
        int iD = w5o1.c.b(getClass()).d(this);
        ((qrn1) this).zza = iD;
        return iD;
    }

    public final /* synthetic */ vyn1 l() {
        return (vyn1) b(6, null);
    }

    public final String toString() {
        String string = super/*java.lang.Object*/.toString();
        char[] cArr = s4o1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        s4o1.b(this, sb, 0);
        return sb.toString();
    }
}
