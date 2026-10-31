package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qhc1 extends wca {
    public final hba r;
    public final String s;
    public final boolean t;
    public final y8h u;
    public isi1 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public qhc1(cdf0 cdf0Var, hba hbaVar, ex61 ex61Var) {
        int iC = l1d.C(ex61Var.g);
        Paint.Cap cap = iC != 0 ? iC != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iC2 = l1d.C(ex61Var.h);
        super(cdf0Var, hbaVar, cap, iC2 != 0 ? iC2 != 1 ? iC2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, ex61Var.i, ex61Var.e, ex61Var.f, ex61Var.c, ex61Var.b);
        this.r = hbaVar;
        this.s = ex61Var.a;
        this.t = ex61Var.j;
        y8h y8hVarC0 = ex61Var.d.c0();
        this.u = y8hVarC0;
        y8hVarC0.a(this);
        hbaVar.d(y8hVarC0);
    }

    @Override // p.wca
    public final void f(Canvas canvas, Matrix matrix, int i) {
        if (this.t) {
            return;
        }
        int iK = this.u.k();
        p9b0 p9b0Var = this.i;
        p9b0Var.setColor(iK);
        isi1 isi1Var = this.v;
        if (isi1Var != null) {
            p9b0Var.setColorFilter((ColorFilter) isi1Var.e());
        }
        super.f(canvas, matrix, i);
    }

    @Override // p.wca
    public final void g(Object obj, j2e0 j2e0Var) {
        super.g(obj, j2e0Var);
        PointF pointF = ndf0.a;
        y8h y8hVar = this.u;
        if (obj == 2) {
            y8hVar.j(j2e0Var);
            return;
        }
        if (obj == ndf0.F) {
            isi1 isi1Var = this.v;
            hba hbaVar = this.r;
            if (isi1Var != null) {
                hbaVar.o(isi1Var);
            }
            if (j2e0Var == null) {
                this.v = null;
                return;
            }
            isi1 isi1Var2 = new isi1((Object) null, j2e0Var);
            this.v = isi1Var2;
            isi1Var2.a(this);
            hbaVar.d(y8hVar);
        }
    }

    public final String getName() {
        return this.s;
    }
}
