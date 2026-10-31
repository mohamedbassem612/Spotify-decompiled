package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dto0 {
    public final tym0 a;
    public final i8h1 b;
    public final lcs c;
    public final kqi0 d;
    public final jxy0 e;
    public final fxy0 f;
    public final twy0 g;

    public dto0(tym0 tym0Var, i8h1 i8h1Var, lcs lcsVar, kqi0 kqi0Var, jxy0 jxy0Var, fxy0 fxy0Var, twy0 twy0Var) {
        this.a = tym0Var;
        this.b = i8h1Var;
        this.c = lcsVar;
        this.d = kqi0Var;
        this.e = jxy0Var;
        this.f = fxy0Var;
        this.g = twy0Var;
    }

    public final void a(iu30 iu30Var, exy0 exy0Var) {
        iu30Var.invoke(new gxy0(this.d.m(), exy0Var));
    }

    public final boolean b(Context context) {
        return this.a.g(context);
    }

    public final void c(dg30 dg30Var, hxy0 hxy0Var, uwy0 uwy0Var, iu30 iu30Var) {
        twy0 twy0Var = this.g;
        String strB = twy0Var.b();
        dxy0 dxy0Var = dxy0.a;
        if (strB == null) {
            a(iu30Var, dxy0Var);
            return;
        }
        if (this.a.g(dg30Var)) {
            twy0Var.a(strB);
            a(iu30Var, vwy0.a);
            return;
        }
        int iC = l1d.C(this.e.a(hxy0Var));
        if (iC == 0) {
            this.f.a();
            if (!zko1.n(dg30Var, strB)) {
                twy0Var.a(strB);
                a(iu30Var, dxy0Var);
                return;
            } else {
                ((saa0) c921.y(cto1.q(dg30Var), (o8n) null, 0, new cto0(this, iu30Var, (lnm) null, (byte) 0), 3)).L(new j9n0(this, iu30Var, (byte) 20));
                return;
            }
        }
        if (iC == 1) {
            if (v9c.q(dg30Var, uwy0Var, hxy0Var, this.b, this.c, (zso0) null, iu30Var, this.d, this.g, strB, 32)) {
                return;
            }
            twy0Var.a(strB);
            a(iu30Var, dxy0Var);
            return;
        }
        if (iC != 2) {
            eg.o();
            return;
        }
        twy0Var.a(strB);
        a(iu30Var, ywy0.a);
        this.c.a(dg30Var, hxy0Var, 3);
    }

    public final boolean d(dg30 dg30Var, yro0 yro0Var, zso0 zso0Var) {
        twy0 twy0Var = this.g;
        String strB = twy0Var.b();
        if (strB == null) {
            if (zso0Var != null) {
                zso0Var.e();
                return false;
            }
        } else {
            if (!this.a.g(dg30Var)) {
                boolean zQ = v9c.q(dg30Var, new uwy0(yro0Var.getTitle(), yro0Var.a(), yro0Var.g(), yro0Var.b()), ulo1.g(yro0Var.h()), this.b, this.c, zso0Var, (iu30) null, this.d, this.g, strB, 64);
                if (zQ) {
                    return zQ;
                }
                twy0Var.a(strB);
                if (zso0Var != null) {
                    zso0Var.e();
                }
                return zQ;
            }
            twy0Var.a(strB);
            if (zso0Var != null) {
                zso0Var.e();
            }
        }
        return false;
    }
}
