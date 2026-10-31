package p;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class noo {
    public final ha4 a;
    public final st60 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public c8e1 j;
    public y9e1 k;
    public hyp0 l;
    public n511 n;
    public n511 o;
    public final Object c = new Object();
    public iu30 m = ye3.d1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f81p = new CursorAnchorInfo.Builder();
    public final float[] q = kch0.a();
    public final Matrix r = new Matrix();

    public noo(ha4 ha4Var, st60 st60Var) {
        this.a = ha4Var;
        this.b = st60Var;
    }

    public final void a() {
        st60 st60Var = this.b;
        if (st60Var.y()) {
            iu30 iu30Var = this.m;
            float[] fArr = this.q;
            iu30Var.invoke(new kch0(fArr));
            this.a.r(fArr);
            Matrix matrix = this.r;
            y9g1.v(matrix, fArr);
            c8e1 c8e1Var = this.j;
            c8e1Var.getClass();
            hyp0 hyp0Var = this.l;
            hyp0Var.getClass();
            y9e1 y9e1Var = this.k;
            y9e1Var.getClass();
            n511 n511Var = this.n;
            n511Var.getClass();
            n511 n511Var2 = this.o;
            n511Var2.getClass();
            st60Var.M(ywo1.h(this.f81p, c8e1Var, hyp0Var, y9e1Var, matrix, n511Var, n511Var2, this.f, this.g, this.h, this.i));
            this.e = false;
        }
    }
}
