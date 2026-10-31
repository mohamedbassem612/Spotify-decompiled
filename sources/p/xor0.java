package p;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xor0 {
    public String a;
    public lee1 b;
    public f930 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public long h;
    public wat i;
    public nw4 j;
    public boolean k;
    public long l;
    public csj0 m;
    public uor0 n;
    public flb0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f172p;
    public int q;
    public int r;
    public long s;

    public xor0(String str, lee1 lee1Var, f930 f930Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = lee1Var;
        this.c = f930Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        int i4 = xf80.b;
        this.h = xf80.a;
        this.l = 0L;
        if (!(true & true)) {
            sf80.a("width and height must be >= 0");
        }
        this.f172p = jjl.h(0, 0, 0, 0);
        this.q = -1;
        this.r = -1;
    }

    public static long f(xor0 xor0Var, long j, flb0 flb0Var) {
        lee1 lee1Var = xor0Var.b;
        csj0 csj0Var = xor0Var.m;
        wat watVar = xor0Var.i;
        watVar.getClass();
        csj0 csj0VarU = i1p1.u(csj0Var, flb0Var, lee1Var, watVar, xor0Var.c);
        xor0Var.m = csj0VarU;
        return csj0VarU.a(xor0Var.g, j);
    }

    public final int a(int i, flb0 flb0Var) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = jjl.a(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
        if (this.g > 1) {
            jA = f(this, jA, flb0Var);
        }
        uor0 uor0VarE = e(flb0Var);
        boolean z = this.e;
        int iH = r2p1.h(vgo1.j(uor0VarE, ijo1.s(uor0VarE.d(), this.d, jA, z), ijo1.t(this.d, this.f, this.e), this.d).f);
        int iJ = hjl.j(jA);
        if (iH < iJ) {
            iH = iJ;
        }
        this.q = i;
        this.r = iH;
        return iH;
    }

    public final boolean b(long j, flb0 flb0Var) {
        uor0 uor0Var;
        this.s = (this.s << 2) | 3;
        boolean z = true;
        if (this.g > 1) {
            j = f(this, j, flb0Var);
        }
        nw4 nw4Var = this.j;
        boolean z2 = false;
        if (nw4Var != null && (uor0Var = this.n) != null && !uor0Var.a() && flb0Var == this.o && (hjl.c(j, this.f172p) || (hjl.i(j) == hjl.i(this.f172p) && hjl.k(j) == hjl.k(this.f172p) && hjl.h(j) >= nw4Var.f && !nw4Var.d.d))) {
            if (!hjl.c(j, this.f172p)) {
                nw4 nw4Var2 = this.j;
                nw4Var2.getClass();
                long jD = jjl.d(j, (((long) r2p1.h(Math.min(nw4Var2.a.i.a(), nw4Var2.d()))) << 32) | (((long) r2p1.h(nw4Var2.f)) & 4294967295L));
                this.l = jD;
                if (this.d == 3 || (((int) (jD >> 32)) >= nw4Var2.d() && ((int) (4294967295L & jD)) >= nw4Var2.f)) {
                    z = false;
                }
                this.k = z;
                this.f172p = j;
            }
            return false;
        }
        uor0 uor0VarE = e(flb0Var);
        nw4 nw4VarJ = vgo1.j(uor0VarE, ijo1.s(uor0VarE.d(), this.d, j, this.e), ijo1.t(this.d, this.f, this.e), this.d);
        this.f172p = j;
        long jD2 = jjl.d(j, (((long) r2p1.h(nw4VarJ.d())) << 32) | (((long) r2p1.h(nw4VarJ.f)) & 4294967295L));
        this.l = jD2;
        if (this.d != 3 && (((int) (jD2 >> 32)) < nw4VarJ.d() || ((int) (jD2 & 4294967295L)) < nw4VarJ.f)) {
            z2 = true;
        }
        this.k = z2;
        this.j = nw4VarJ;
        return true;
    }

    public final void c() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.f172p = jjl.h(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void d(wat watVar) {
        long jA;
        wat watVar2 = this.i;
        if (watVar != null) {
            int i = xf80.b;
            jA = xf80.a(watVar.h(), watVar.U0());
        } else {
            jA = xf80.a;
        }
        if (watVar2 == null) {
            this.i = watVar;
            this.h = jA;
        } else if (watVar == null || this.h != jA) {
            this.i = watVar;
            this.h = jA;
            this.s = (this.s << 2) | 1;
            c();
        }
    }

    public final uor0 e(flb0 flb0Var) {
        uor0 rw4Var = this.n;
        if (rw4Var == null || flb0Var != this.o || rw4Var.a()) {
            this.o = flb0Var;
            String str = this.a;
            lee1 lee1VarF = z6p1.F(this.b, flb0Var);
            wat watVar = this.i;
            watVar.getClass();
            f930 f930Var = this.c;
            boolean z = this.e;
            z6x z6xVar = z6x.a;
            rw4Var = new rw4(str, lee1VarF, z6xVar, z6xVar, f930Var, watVar, z);
        }
        this.n = rw4Var;
        return rw4Var;
    }

    public final String toString() {
        return pze0.h(this.s, ", constraints=$)", gvg.n("ParagraphLayoutCache(paragraph=", this.j != null ? "<paragraph>" : "null", ", lastDensity=", xf80.b(this.h), ", history="));
    }
}
