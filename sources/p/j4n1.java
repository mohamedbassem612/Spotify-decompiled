package p;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j4n1 extends i520 {
    public static final s8s0 f;
    public final s8s0 c;
    public final i520 d;
    public final LinkedHashMap e;

    static {
        String str = s8s0.b;
        f = gtv0.f("/");
    }

    public j4n1(s8s0 s8s0Var, i520 i520Var, LinkedHashMap linkedHashMap) {
        this.c = s8s0Var;
        this.d = i520Var;
        this.e = linkedHashMap;
    }

    public final c291 a(s8s0 s8s0Var) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final void c(s8s0 s8s0Var, s8s0 s8s0Var2) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final void d(s8s0 s8s0Var) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final void e(s8s0 s8s0Var) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final List f(s8s0 s8s0Var) {
        s8s0 s8s0Var2 = f;
        s8s0Var2.getClass();
        i4n1 i4n1Var = (i4n1) this.e.get(c.a(s8s0Var2, s8s0Var, true));
        if (i4n1Var != null) {
            return o7h.l1(i4n1Var.q);
        }
        hhg1.l(s8s0Var, "not a directory: ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    public final q420 g(s8s0 s8s0Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        s8s0 s8s0Var2 = f;
        s8s0Var2.getClass();
        i4n1 i4n1VarH = (i4n1) this.e.get(c.a(s8s0Var2, s8s0Var, true));
        if (i4n1VarH == null) {
            return null;
        }
        long j = i4n1VarH.h;
        if (j != -1) {
            wia0 wia0VarH = this.d.h(this.c);
            try {
                ff01 ff01Var = new ff01(wia0VarH.a(j));
                try {
                    i4n1VarH = rrn1.H(ff01Var, i4n1VarH);
                    i4n1VarH.getClass();
                    try {
                        ff01Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        ff01Var.close();
                    } catch (Throwable th5) {
                        j2h1.h(th4, th5);
                    }
                    th2 = th4;
                    i4n1VarH = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    wia0VarH.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (wia0VarH != null) {
                    try {
                        wia0VarH.close();
                    } catch (Throwable th8) {
                        j2h1.h(th7, th8);
                    }
                }
                th = th7;
                i4n1VarH = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = i4n1VarH.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(i4n1VarH.f);
        Long l2 = i4n1VarH.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = i4n1VarH.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = i4n1VarH.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = i4n1VarH.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = i4n1VarH.j;
                if (i != -1) {
                    int i2 = i4n1VarH.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = i4n1VarH.l;
        if (l4 == null) {
            Integer num3 = i4n1VarH.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new q420(z2, z, (s8s0) null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new q420(z2, z, (s8s0) null, lValueOf4, lValueOf, lValueOf2, l);
    }

    public final wia0 h(s8s0 s8s0Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public final c291 i(s8s0 s8s0Var, boolean z) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    public final fka1 j(s8s0 s8s0Var) throws Throwable {
        Throwable th;
        ff01 ff01Var;
        s8s0 s8s0Var2 = f;
        s8s0Var2.getClass();
        i4n1 i4n1Var = (i4n1) this.e.get(c.a(s8s0Var2, s8s0Var, true));
        if (i4n1Var == null) {
            t8e1.p(s8s0Var, "no such file: ");
            return null;
        }
        long j = i4n1Var.f;
        wia0 wia0VarH = this.d.h(this.c);
        try {
            ff01Var = new ff01(wia0VarH.a(i4n1Var.h));
            try {
                wia0VarH.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (wia0VarH != null) {
                try {
                    wia0VarH.close();
                } catch (Throwable th4) {
                    j2h1.h(th3, th4);
                }
            }
            th = th3;
            ff01Var = null;
        }
        if (th != null) {
            throw th;
        }
        rrn1.H(ff01Var, (i4n1) null);
        return i4n1Var.g == 0 ? new nn20(ff01Var, j, true) : new nn20(new fb80(new nn20(ff01Var, i4n1Var.e, true), new Inflater(true)), j, false);
    }
}
