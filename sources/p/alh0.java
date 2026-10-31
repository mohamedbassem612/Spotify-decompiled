package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class alh0 implements plh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rlh0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ alh0(rlh0 rlh0Var, List list, byte b) {
        this.a = b;
        this.b = rlh0Var;
        this.c = list;
    }

    public final void f(kh70 kh70Var, int i) {
        byte b = this.a;
        int i2 = 0;
        List list = this.c;
        rlh0 rlh0Var = this.b;
        switch (b) {
            case 0:
                xlh0 xlh0Var = rlh0Var.c;
                v280 v280VarM = b380.m();
                while (i2 < list.size()) {
                    v280VarM.c(((yoh0) list.get(i2)).e(rlh0Var.o(), true));
                    i2++;
                }
                kh70Var.H0(xlh0Var, i, new occ(v280VarM.g()), true);
                break;
            default:
                xlh0 xlh0Var2 = rlh0Var.c;
                v280 v280VarM2 = b380.m();
                while (i2 < list.size()) {
                    v280VarM2.c(((yoh0) list.get(i2)).e(rlh0Var.o(), true));
                    i2++;
                }
                kh70Var.P0(xlh0Var2, i, new occ(v280VarM2.g()));
                break;
        }
    }
}
