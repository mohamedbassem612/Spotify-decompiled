package p;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zht {
    public static final Set b = Collections.singleton(h6b0.CLASS);
    public static final Set c = f46.S0(new h6b0[]{h6b0.FILE_FACADE, h6b0.MULTIFILE_CLASS_PART});
    public static final joj0 d;
    public static final joj0 e;
    public ks6 a;

    static {
        new joj0(false, new int[]{1, 1, 2});
        d = new joj0(false, new int[]{1, 1, 11});
        e = new joj0(false, new int[]{1, 1, 13});
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    public final git a(dzq0 dzq0Var, jc11 jc11Var) {
        String[] strArr;
        mmr0 mmr0VarG;
        at7 at7Var = jc11Var.b;
        joj0 joj0Var = (joj0) at7Var.d;
        String[] strArr2 = (String[]) at7Var.e;
        if (strArr2 == null) {
            strArr2 = (String[]) at7Var.f;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!c.contains((h6b0) at7Var.c)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = (String[]) at7Var.g) != null) {
            try {
                try {
                    mmr0VarG = fka0.g(strArr2, strArr);
                } catch (InvalidProtocolBufferException e2) {
                    throw new IllegalStateException("Could not read data from ".concat(jc11Var.a()), e2);
                }
            } catch (Throwable th) {
                ((u321) c().c).getClass();
                joj0 joj0VarE = e();
                joj0 joj0Var2 = joj0Var.f ? joj0.g : joj0.h;
                int i = joj0Var2.b;
                int i2 = joj0VarE.b;
                if (i > i2 || (i >= i2 && joj0Var2.c > joj0VarE.c)) {
                    joj0VarE = joj0Var2;
                }
                int i3 = joj0Var.c;
                int i4 = joj0Var.b;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = joj0VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > joj0VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                mmr0VarG = null;
            }
            if (mmr0VarG != null) {
                jja0 jja0Var = (jja0) mmr0VarG.a;
                cgy0 cgy0Var = (cgy0) mmr0VarG.b;
                d(jc11Var);
                f(jc11Var);
                b(jc11Var);
                lja0 lja0Var = new lja0(jc11Var, cgy0Var, jja0Var);
                return new git(dzq0Var, cgy0Var, jja0Var, joj0Var, lja0Var, c(), "scope for " + lja0Var + " in " + dzq0Var, b69.g);
            }
        }
        return null;
    }

    public final int b(jc11 jc11Var) {
        ((u321) c().c).getClass();
        int i = jc11Var.b.b;
        return ((i & 16) == 0 || (i & 32) != 0) ? 1 : 2;
    }

    public final ks6 c() {
        ks6 ks6Var = this.a;
        if (ks6Var != null) {
            return ks6Var;
        }
        u890.C("components");
        throw null;
    }

    public final h980 d(jc11 jc11Var) {
        ((u321) c().c).getClass();
        at7 at7Var = jc11Var.b;
        joj0 joj0Var = (joj0) at7Var.d;
        joj0 joj0Var2 = (joj0) at7Var.d;
        joj0 joj0VarE = e();
        joj0 joj0Var3 = joj0Var2.f ? joj0.g : joj0.h;
        int i = joj0Var3.b;
        int i2 = joj0VarE.b;
        if (i > i2 || (i >= i2 && joj0Var3.c > joj0VarE.c)) {
            joj0VarE = joj0Var3;
        }
        int i3 = joj0Var2.c;
        int i4 = joj0Var2.b;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = joj0VarE.b;
            if (i4 > i5 || (i4 >= i5 && i3 > joj0VarE.c)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        joj0 joj0Var4 = joj0.g;
        joj0 joj0VarE2 = e();
        joj0 joj0VarE3 = e();
        boolean z2 = joj0Var.f;
        joj0VarE3.getClass();
        joj0 joj0Var5 = z2 ? joj0Var4 : joj0.h;
        int i6 = joj0Var5.b;
        int i7 = joj0VarE3.b;
        return new h980(joj0Var, joj0Var4, joj0VarE2, (i6 <= i7 && (i6 < i7 || joj0Var5.c <= joj0VarE3.c)) ? joj0VarE3 : joj0Var5, jc11Var.a());
    }

    public final joj0 e() {
        ((u321) c().c).getClass();
        return joj0.g;
    }

    public final boolean f(jc11 jc11Var) {
        ((u321) c().c).getClass();
        ((u321) c().c).getClass();
        at7 at7Var = jc11Var.b;
        return (at7Var.b & 2) != 0 && ((joj0) at7Var.d).equals(d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public final ydg g(jc11 jc11Var) {
        String[] strArr;
        mmr0 mmr0Var;
        at7 at7Var = jc11Var.b;
        joj0 joj0Var = (joj0) at7Var.d;
        String[] strArr2 = (String[]) at7Var.e;
        if (strArr2 == null) {
            strArr2 = (String[]) at7Var.f;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!b.contains((h6b0) at7Var.c)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = (String[]) at7Var.g) != null) {
            boolean z = false;
            try {
                try {
                    vz00 vz00Var = fka0.a;
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(pwa.a(strArr2));
                    vz00 vz00Var2 = fka0.a;
                    jja0 jja0Var = new jja0((dka0) dka0.h.a(byteArrayInputStream, vz00Var2), strArr);
                    tja0 tja0Var = hfy0.h1;
                    tja0Var.getClass();
                    mwg mwgVar = new mwg(byteArrayInputStream);
                    t8 t8Var = (t8) tja0Var.b(mwgVar, vz00Var2);
                    try {
                        mwgVar.a(0);
                        if (!t8Var.isInitialized()) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                            invalidProtocolBufferException.a = t8Var;
                            throw invalidProtocolBufferException;
                        }
                        mmr0Var = new mmr0(jja0Var, (hfy0) t8Var);
                        if (mmr0Var != null) {
                            jja0 jja0Var2 = (jja0) mmr0Var.a;
                            hfy0 hfy0Var = (hfy0) mmr0Var.b;
                            d(jc11Var);
                            f(jc11Var);
                            b(jc11Var);
                            return new ydg(jja0Var2, hfy0Var, joj0Var, new u6b0(jc11Var));
                        }
                    } catch (InvalidProtocolBufferException e2) {
                        e2.a = t8Var;
                        throw e2;
                    }
                } catch (InvalidProtocolBufferException e3) {
                    throw new IllegalStateException("Could not read data from ".concat(jc11Var.a()), e3);
                }
            } catch (Throwable th) {
                ((u321) c().c).getClass();
                joj0 joj0VarE = e();
                joj0 joj0Var2 = joj0Var.f ? joj0.g : joj0.h;
                int i = joj0Var2.b;
                int i2 = joj0VarE.b;
                if (i > i2 || (i >= i2 && joj0Var2.c > joj0VarE.c)) {
                    joj0VarE = joj0Var2;
                }
                int i3 = joj0Var.c;
                int i4 = joj0Var.b;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = joj0VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > joj0VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                mmr0Var = null;
            }
        }
        return null;
    }
}
