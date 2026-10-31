package p;

import com.google.android.recaptcha.internal.zzals;
import com.google.android.recaptcha.internal.zzanf;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rin1 extends nhn1 {
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private int zza;
    protected bkn1 zzc;

    public rin1() {
        this.zzb = 0;
        this.zza = -1;
        this.zzc = bkn1.f;
    }

    public static lin1 k(Class cls) {
        ConcurrentMap concurrentMap = zzd;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            l(cls);
            obj = concurrentMap.get(cls);
        }
        if (obj == null) {
            eg.m("Default instance cannot be null.");
            return null;
        }
        if (obj instanceof lin1) {
            return (lin1) obj;
        }
        lin1 lin1Var = new lin1((rin1) obj);
        return concurrentMap.replace(cls, obj, lin1Var) ? lin1Var : (lin1) concurrentMap.get(cls);
    }

    public static rin1 l(Class cls) {
        ConcurrentMap concurrentMap = zzd;
        Object obj = concurrentMap.get(cls);
        if (obj == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                obj = concurrentMap.get(cls);
            } catch (ClassNotFoundException e) {
                k220.p("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (obj == null) {
            try {
                obj = (rin1) ((rin1) dkn1.a.allocateInstance(cls)).u(6);
                if (obj == null) {
                    bhn0.w();
                    return null;
                }
                concurrentMap.put(cls, obj);
            } catch (InstantiationException e2) {
                bhn0.p(e2);
                return null;
            }
        }
        return obj instanceof rin1 ? (rin1) obj : ((lin1) obj).a;
    }

    public static void m(Class cls, rin1 rin1Var) {
        rin1Var.w();
        zzd.put(cls, rin1Var);
    }

    public static Object n(Method method, rin1 rin1Var, Object... objArr) {
        try {
            return method.invoke(rin1Var, objArr);
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

    public static rin1 o(rin1 rin1Var, ain1 ain1Var, hin1 hin1Var) throws zzals {
        rin1 rin1VarT = t(rin1Var, ain1Var, hin1Var);
        s(rin1VarT);
        return rin1VarT;
    }

    public static rin1 p(rin1 rin1Var, byte[] bArr) throws zzals {
        int length = bArr.length;
        hin1 hin1Var = hin1.b;
        int i = phn1.a;
        rin1 rin1VarR = r(rin1Var, bArr, length, hin1.b);
        s(rin1VarR);
        return rin1VarR;
    }

    public static final boolean q(rin1 rin1Var, boolean z) {
        Object objU = rin1Var.u(1);
        if (objU != null) {
            if (objU instanceof Byte) {
                byte bByteValue = ((Byte) objU).byteValue();
                if (bByteValue != 1) {
                    if (bByteValue == 0) {
                        return false;
                    }
                }
            }
            boolean zZzl = ljn1.b.a(rin1Var.getClass()).zzl(rin1Var);
            if (z) {
                rin1Var.u(2);
            }
            return zZzl;
        }
        return true;
    }

    public static rin1 r(rin1 rin1Var, byte[] bArr, int i, hin1 hin1Var) throws zzals {
        if (i == 0) {
            return rin1Var;
        }
        rin1 rin1VarG = rin1Var.g();
        try {
            qjn1 qjn1VarA = ljn1.b.a(rin1VarG.getClass());
            qhn1 qhn1Var = new qhn1();
            hin1Var.getClass();
            qjn1VarA.e(rin1VarG, bArr, 0, i, qhn1Var);
            qjn1VarA.b(rin1VarG);
            return rin1VarG;
        } catch (zzals e) {
            if (e.a) {
                throw new zzals(e.getMessage(), e);
            }
            throw e;
        } catch (zzanf e2) {
            x4n1.g(e2.getMessage());
            return null;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzals) {
                throw ((zzals) e3.getCause());
            }
            throw new zzals(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static void s(rin1 rin1Var) {
        if (rin1Var == null || q(rin1Var, true)) {
            return;
        }
        x4n1.g(new zzanf().getMessage());
    }

    public static rin1 t(rin1 rin1Var, ain1 ain1Var, hin1 hin1Var) throws zzals {
        din1 din1VarS = ain1Var.s();
        rin1 rin1VarG = rin1Var.g();
        try {
            qjn1 qjn1VarA = ljn1.b.a(rin1VarG.getClass());
            a9a a9aVar = din1VarS.c;
            if (a9aVar == null) {
                a9aVar = new a9a(din1VarS);
            }
            qjn1VarA.f(rin1VarG, a9aVar, hin1Var);
            qjn1VarA.b(rin1VarG);
            din1VarS.e();
            return rin1VarG;
        } catch (zzals e) {
            if (e.a) {
                throw new zzals(e.getMessage(), e);
            }
            throw e;
        } catch (zzanf e2) {
            x4n1.g(e2.getMessage());
            return null;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzals) {
                throw ((zzals) e3.getCause());
            }
            throw new zzals(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzals) {
                throw ((zzals) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // p.nhn1
    public final void a(w4c0 w4c0Var) {
        qjn1 qjn1VarA = ljn1.b.a(getClass());
        ltf1 ltf1Var = (ltf1) w4c0Var.d;
        if (ltf1Var == null) {
            ltf1Var = new ltf1(w4c0Var);
        }
        qjn1VarA.h(this, ltf1Var);
    }

    @Override // p.nhn1
    public final int e(qjn1 qjn1Var) {
        int iD;
        int iD2;
        if (v()) {
            if (qjn1Var == null) {
                iD2 = ljn1.b.a(getClass()).d(this);
            } else {
                iD2 = qjn1Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            eg.m(gvg.l(new StringBuilder(String.valueOf(iD2).length() + 42), "serialized size must be non-negative, was ", iD2));
            return 0;
        }
        int i = this.zza & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        if (qjn1Var == null) {
            iD = ljn1.b.a(getClass()).d(this);
        } else {
            iD = qjn1Var.d(this);
        }
        j(iD);
        return iD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ljn1.b.a(getClass()).c(this, (rin1) obj);
    }

    public final lin1 f() {
        return (lin1) u(7);
    }

    public final rin1 g() {
        return (rin1) u(4);
    }

    public final kin1 h() {
        return (kin1) u(5);
    }

    public final int hashCode() {
        if (v()) {
            return ljn1.b.a(getClass()).g(this);
        }
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int iG = ljn1.b.a(getClass()).g(this);
        this.zzb = iG;
        return iG;
    }

    public final kin1 i() {
        kin1 kin1Var = (kin1) u(5);
        kin1Var.g(this);
        return kin1Var;
    }

    public final void j(int i) {
        if (i >= 0) {
            this.zza = i | (this.zza & Integer.MIN_VALUE);
        } else {
            eg.m(gvg.l(new StringBuilder(String.valueOf(i).length() + 42), "serialized size must be non-negative, was ", i));
        }
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = hjn1.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        hjn1.b(this, sb, 0);
        return sb.toString();
    }

    public abstract Object u(int i);

    public final boolean v() {
        return this.zza < 0;
    }

    public final void w() {
        this.zza &= Integer.MAX_VALUE;
    }
}
