package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class i1i0 implements b2i0, c2i0, akl {
    public final /* synthetic */ h2i0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ i1i0(h2i0 h2i0Var, int i, int i2) {
        this.a = h2i0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // p.c2i0
    public void a(ffu0 ffu0Var, ixh0 ixh0Var, List list) {
        h2i0 h2i0Var = this.a;
        ffu0Var.D(h2i0Var.b1(ixh0Var, ffu0Var, this.b), h2i0Var.b1(ixh0Var, ffu0Var, this.c), list);
    }

    public void accept(Object obj) {
        h2i0 h2i0Var = this.a;
        ((fzh0) h2i0Var.l.get()).getClass();
        f2i0 f2i0Var = h2i0Var.w;
        if (f2i0Var != null) {
            f2i0Var.setFixedSize(this.b, this.c);
        }
    }

    public void b(ffu0 ffu0Var, ixh0 ixh0Var) {
        h2i0 h2i0Var = this.a;
        ffu0Var.H(h2i0Var.b1(ixh0Var, ffu0Var, this.b), h2i0Var.b1(ixh0Var, ffu0Var, this.c));
    }
}
