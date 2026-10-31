package p;

import android.util.Pair;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class brh0 {
    public final d8h0 a;
    public final Object b;
    public final p641[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public crh0 g;
    public final boolean[] h;
    public final boolean[] i;
    public final jca[] j;
    public final exs k;
    public final g3i0 l;
    public brh0 m;
    public qnf1 n;
    public o0g1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f17p;

    public brh0(jca[] jcaVarArr, long j, exs exsVar, k9r k9rVar, g3i0 g3i0Var, crh0 crh0Var, o0g1 o0g1Var) {
        this.j = jcaVarArr;
        this.f17p = j;
        this.k = exsVar;
        this.l = g3i0Var;
        p2i0 p2i0Var = crh0Var.a;
        Object obj = p2i0Var.a;
        this.b = obj;
        this.g = crh0Var;
        this.n = qnf1.d;
        this.o = o0g1Var;
        this.c = new p641[jcaVarArr.length];
        this.h = new boolean[jcaVarArr.length];
        this.i = new boolean[jcaVarArr.length];
        long j2 = crh0Var.b;
        g3i0Var.getClass();
        int i = uwu0.n;
        Object obj2 = ((Pair) obj).first;
        p2i0 p2i0VarA = p2i0Var.a(((Pair) obj).second);
        f3i0 f3i0Var = (f3i0) g3i0Var.e.get(obj2);
        f3i0Var.getClass();
        g3i0Var.h.add(f3i0Var);
        e3i0 e3i0Var = (e3i0) g3i0Var.g.get(f3i0Var);
        if (e3i0Var != null) {
            e3i0Var.a.j(e3i0Var.b);
        }
        f3i0Var.c.add(p2i0VarA);
        d8h0 d8h0VarF = f3i0Var.a.f(p2i0VarA, k9rVar, j2);
        g3i0Var.d.put(d8h0VarF, f3i0Var);
        g3i0Var.c();
        this.a = d8h0VarF;
    }

    public final long a(o0g1 o0g1Var, long j, boolean z, boolean[] zArr) {
        boolean[] zArr2;
        jca[] jcaVarArr;
        boolean[] zArr3;
        p641[] p641VarArr;
        qp00[] qp00VarArr = (qp00[]) o0g1Var.d;
        int i = 0;
        while (true) {
            int i2 = o0g1Var.b;
            zArr2 = this.i;
            boolean z2 = true;
            if (i >= i2) {
                break;
            }
            if (z || !o0g1Var.n(this.o, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i3 = 0;
        while (true) {
            jcaVarArr = this.j;
            int length = jcaVarArr.length;
            zArr3 = zArr2;
            p641VarArr = this.c;
            if (i3 >= length) {
                break;
            }
            if (jcaVarArr[i3].b == -2) {
                p641VarArr[i3] = null;
            }
            i3++;
            zArr2 = zArr3;
        }
        b();
        this.o = o0g1Var;
        c();
        long jM = this.a.m(qp00VarArr, zArr3, p641VarArr, zArr, j);
        for (int i4 = 0; i4 < jcaVarArr.length; i4++) {
            if (jcaVarArr[i4].b == -2 && this.o.o(i4)) {
                p641VarArr[i4] = new pvc((byte) 8);
            }
        }
        this.f = false;
        for (int i5 = 0; i5 < p641VarArr.length; i5++) {
            if (p641VarArr[i5] != null) {
                dm5.y(o0g1Var.o(i5));
                if (jcaVarArr[i5].b != -2) {
                    this.f = true;
                }
            } else {
                dm5.y(qp00VarArr[i5] == null);
            }
        }
        return jM;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            o0g1 o0g1Var = this.o;
            if (i >= o0g1Var.b) {
                return;
            }
            boolean zO = o0g1Var.o(i);
            qp00 qp00Var = ((qp00[]) this.o.d)[i];
            if (zO && qp00Var != null) {
                qp00Var.g();
            }
            i++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i = 0;
        while (true) {
            o0g1 o0g1Var = this.o;
            if (i >= o0g1Var.b) {
                return;
            }
            boolean zO = o0g1Var.o(i);
            qp00 qp00Var = ((qp00[]) this.o.d)[i];
            if (zO && qp00Var != null) {
                qp00Var.p();
            }
            i++;
        }
    }

    public final long d() {
        if (!this.e) {
            return this.g.b;
        }
        long jX = this.f ? this.a.x() : Long.MIN_VALUE;
        return jX == Long.MIN_VALUE ? this.g.e : jX;
    }

    public final brh0 e() {
        return this.m;
    }

    public final long f() {
        return this.f17p;
    }

    public final long g() {
        return this.g.b + this.f17p;
    }

    public final void h(float f, sqe1 sqe1Var, boolean z) {
        this.e = true;
        this.n = this.a.u();
        o0g1 o0g1VarL = l(f, sqe1Var, z);
        crh0 crh0Var = this.g;
        long jMax = crh0Var.b;
        long j = crh0Var.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(o0g1VarL, jMax, false, new boolean[this.j.length]);
        long j2 = this.f17p;
        crh0 crh0Var2 = this.g;
        this.f17p = (crh0Var2.b - jA) + j2;
        this.g = crh0Var2.b(jA, crh0Var2.c);
    }

    public final boolean i() {
        if (this.e) {
            return !this.f || this.a.x() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean j() {
        if (this.e) {
            return i() || d() - this.g.b >= -9223372036854775807L;
        }
        return false;
    }

    public final void k() {
        b();
        g3i0 g3i0Var = this.l;
        d8h0 d8h0Var = this.a;
        try {
            IdentityHashMap identityHashMap = g3i0Var.d;
            f3i0 f3i0Var = (f3i0) identityHashMap.remove(d8h0Var);
            f3i0Var.getClass();
            f3i0Var.a.t(d8h0Var);
            f3i0Var.c.remove(d8h0Var.a);
            if (!identityHashMap.isEmpty()) {
                g3i0Var.c();
            }
            g3i0Var.d(f3i0Var);
        } catch (RuntimeException e) {
            oon1.w("Period release failed.", e);
        }
    }

    public final o0g1 l(float f, sqe1 sqe1Var, boolean z) {
        qnf1 qnf1Var = this.n;
        p2i0 p2i0Var = this.g.a;
        exs exsVar = this.k;
        jca[] jcaVarArr = this.j;
        o0g1 o0g1VarN = exsVar.n(jcaVarArr, qnf1Var, p2i0Var, sqe1Var);
        qp00[] qp00VarArr = (qp00[]) o0g1VarN.d;
        for (int i = 0; i < o0g1VarN.b; i++) {
            boolean z2 = true;
            if (o0g1VarN.o(i)) {
                if (qp00VarArr[i] == null && jcaVarArr[i].b != -2) {
                    z2 = false;
                }
                dm5.y(z2);
            } else {
                dm5.y(qp00VarArr[i] == null);
            }
        }
        for (qp00 qp00Var : qp00VarArr) {
            if (qp00Var != null) {
                qp00Var.i(f);
                qp00Var.o(z);
            }
        }
        return o0g1VarN;
    }
}
