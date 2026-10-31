package p;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tw61 extends hba {
    public final stl C;
    public final i4k D;

    public tw61(cdf0 cdf0Var, qkb0 qkb0Var, i4k i4kVar, fcf0 fcf0Var) {
        super(cdf0Var, qkb0Var);
        this.D = i4kVar;
        stl stlVar = new stl(cdf0Var, this, new qw61("__container", qkb0Var.a, false), fcf0Var);
        this.C = stlVar;
        List list = Collections.EMPTY_LIST;
        stlVar.b(list, list);
    }

    @Override // p.hba, p.p8v
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.C.c(rectF, this.n, z);
    }

    @Override // p.hba
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.C.f(canvas, matrix, i);
    }

    @Override // p.hba
    public final dp5 k() {
        dp5 dp5Var = this.f48p.w;
        return dp5Var != null ? dp5Var : this.D.f48p.w;
    }

    @Override // p.hba
    public final tjq l() {
        tjq tjqVar = this.f48p.x;
        return tjqVar != null ? tjqVar : this.D.f48p.x;
    }

    @Override // p.hba
    public final void p(kpa0 kpa0Var, int i, ArrayList arrayList, kpa0 kpa0Var2) {
        this.C.e(kpa0Var, i, arrayList, kpa0Var2);
    }
}
