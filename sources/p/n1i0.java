package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class n1i0 implements b2i0, c2i0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h2i0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n1i0(h2i0 h2i0Var, int i, byte b) {
        this.a = b;
        this.b = h2i0Var;
        this.c = i;
    }

    @Override // p.c2i0
    public void a(ffu0 ffu0Var, ixh0 ixh0Var, List list) {
        byte b = this.a;
        int i = this.c;
        h2i0 h2i0Var = this.b;
        switch (b) {
            case 1:
                ffu0Var.M0(h2i0Var.b1(ixh0Var, ffu0Var, i), list);
                break;
            case 2:
                if (list.size() != 1) {
                    ffu0Var.D(h2i0Var.b1(ixh0Var, ffu0Var, i), h2i0Var.b1(ixh0Var, ffu0Var, i + 1), list);
                } else {
                    ffu0Var.r0(h2i0Var.b1(ixh0Var, ffu0Var, i), (yoh0) list.get(0));
                }
                break;
            default:
                ffu0Var.M0(h2i0Var.b1(ixh0Var, ffu0Var, i), list);
                break;
        }
    }

    public void b(ffu0 ffu0Var, ixh0 ixh0Var) {
        byte b = this.a;
        int i = this.c;
        h2i0 h2i0Var = this.b;
        switch (b) {
            case 0:
                ffu0Var.H0(h2i0Var.b1(ixh0Var, ffu0Var, i));
                break;
            default:
                ffu0Var.F(h2i0Var.b1(ixh0Var, ffu0Var, i));
                break;
        }
    }
}
