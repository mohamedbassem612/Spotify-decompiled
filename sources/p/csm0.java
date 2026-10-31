package p;

import androidx.compose.ui.unit.TextUnit;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class csm0 {
    public af5 a;
    public f930 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public m0e1 h;
    public csj0 i;
    public long j;
    public wat k;
    public lee1 l;
    public wp20 m;
    public flb0 n;
    public y9e1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f24p;
    public int q;
    public bsm0 r;
    public long s;

    public csm0(af5 af5Var, lee1 lee1Var, f930 f930Var, int i, boolean z, int i2, int i3, List list, m0e1 m0e1Var) {
        this.a = af5Var;
        this.b = f930Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.h = m0e1Var;
        int i4 = xf80.b;
        this.j = t6p1.j();
        this.l = lee1Var;
        this.f24p = -1;
        this.q = -1;
    }

    public final int a(int i, flb0 flb0Var) {
        int i2 = this.f24p;
        int i3 = this.q;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = jjl.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jA = h(jA, flb0Var);
        }
        int iH = r2p1.h(b(jA, flb0Var).e);
        int iJ = hjl.j(jA);
        if (iH < iJ) {
            iH = iJ;
        }
        this.f24p = i;
        this.q = iH;
        return iH;
    }

    public final zrm0 b(long j, flb0 flb0Var) {
        wp20 wp20VarE = e(flb0Var);
        boolean z = this.d;
        return new zrm0(wp20VarE, ijo1.s(wp20VarE.d(), this.c, j, z), ijo1.t(this.c, this.e, this.d), this.c);
    }

    public final boolean c(long j, flb0 flb0Var) {
        this.s = (this.s << 2) | 3;
        long jH = this.f > 1 ? h(j, flb0Var) : j;
        y9e1 y9e1Var = this.o;
        if (y9e1Var != null) {
            zrm0 zrm0Var = y9e1Var.b;
            x9e1 x9e1Var = y9e1Var.a;
            if (!zrm0Var.a.a()) {
                flb0 flb0Var2 = x9e1Var.h;
                long j2 = x9e1Var.j;
                if (flb0Var == flb0Var2 && (hjl.c(jH, j2) || (hjl.i(jH) == hjl.i(j2) && hjl.k(jH) == hjl.k(j2) && hjl.h(jH) >= zrm0Var.e && !zrm0Var.c))) {
                    y9e1 y9e1Var2 = this.o;
                    y9e1Var2.getClass();
                    if (hjl.c(jH, y9e1Var2.a.j)) {
                        return false;
                    }
                    y9e1 y9e1Var3 = this.o;
                    y9e1Var3.getClass();
                    this.o = g(flb0Var, jH, y9e1Var3.b);
                    return true;
                }
            }
        }
        m0e1 m0e1Var = this.h;
        if (m0e1Var != null) {
            this.n = flb0Var;
            long j3 = this.l.a.b;
            bsm0 bsm0Var = this.r;
            if (bsm0Var == null) {
                bsm0Var = new bsm0(this);
                this.r = bsm0Var;
            }
            long jA = m0e1Var.a(bsm0Var, j, this.a);
            if (TextUnit.d(jA)) {
                jA = dsm0.a(j3, jA);
            }
            long j4 = jA;
            bsm0 bsm0Var2 = this.r;
            if (bsm0Var2 == null) {
                bsm0Var2 = new bsm0(this);
                this.r = bsm0Var2;
            }
            y9e1 y9e1VarA = bsm0Var2.a();
            if (y9e1VarA != null) {
                x9e1 x9e1Var2 = y9e1VarA.a;
                if (TextUnit.a(j4, x9e1Var2.b.a.b) && x9e1Var2.f == this.c) {
                    this.o = y9e1VarA;
                    return true;
                }
            }
            f(lee1.a(this.l, 0L, j4, null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 16777213));
        }
        this.o = g(flb0Var, jH, b(jH, flb0Var));
        return true;
    }

    public final void d(wat watVar) {
        wat watVar2 = this.k;
        int i = xf80.b;
        long jA = watVar != null ? xf80.a(watVar.h(), watVar.U0()) : t6p1.j();
        if (watVar2 == null) {
            this.k = watVar;
            this.j = jA;
            return;
        }
        if (watVar == null || this.j != jA) {
            this.k = watVar;
            this.j = jA;
            this.s = (this.s << 2) | 1;
            this.m = null;
            this.o = null;
            this.q = -1;
            this.f24p = -1;
            this.r = null;
        }
    }

    public final wp20 e(flb0 flb0Var) {
        wp20 wp20Var = this.m;
        if (wp20Var == null || flb0Var != this.n || wp20Var.a()) {
            this.n = flb0Var;
            af5 af5Var = this.a;
            lee1 lee1VarF = z6p1.F(this.l, flb0Var);
            wat watVar = this.k;
            watVar.getClass();
            f930 f930Var = this.b;
            z6x z6xVar = this.g;
            if (z6xVar == null) {
                z6xVar = z6x.a;
            }
            wp20Var = new wp20(z6xVar, af5Var, watVar, f930Var, lee1VarF, this.d);
        }
        this.m = wp20Var;
        return wp20Var;
    }

    public final void f(lee1 lee1Var) {
        boolean zD = lee1Var.d(this.l);
        this.l = lee1Var;
        if (zD) {
            return;
        }
        this.s <<= 2;
        this.m = null;
        this.o = null;
        this.q = -1;
        this.f24p = -1;
    }

    public final y9e1 g(flb0 flb0Var, long j, zrm0 zrm0Var) {
        float fMin = Math.min(zrm0Var.a.d(), zrm0Var.d);
        af5 af5Var = this.a;
        lee1 lee1Var = this.l;
        z6x z6xVar = this.g;
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        wat watVar = this.k;
        watVar.getClass();
        return new y9e1(new x9e1(af5Var, lee1Var, z6xVar, i, z, i2, watVar, flb0Var, this.b, j), zrm0Var, jjl.d(j, (((long) r2p1.h(fMin)) << 32) | (((long) r2p1.h(zrm0Var.e)) & 4294967295L)));
    }

    public final long h(long j, flb0 flb0Var) {
        csj0 csj0Var = this.i;
        lee1 lee1Var = this.l;
        wat watVar = this.k;
        watVar.getClass();
        csj0 csj0VarU = i1p1.u(csj0Var, flb0Var, lee1Var, watVar, this.b);
        this.i = csj0VarU;
        return csj0VarU.a(this.f, j);
    }

    public final String toString() {
        String str = this.o != null ? "<TextLayoutResult>" : "null";
        String strB = xf80.b(this.j);
        long j = this.s;
        y9e1 y9e1Var = this.o;
        Object hjlVar = y9e1Var != null ? new hjl(y9e1Var.a.j) : "null";
        StringBuilder sbN = gvg.n("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strB, ", history=");
        sbN.append(j);
        sbN.append(", constraints=");
        sbN.append(hjlVar);
        sbN.append(")");
        return sbN.toString();
    }
}
