package p;

import android.view.Surface;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ykh0 implements plh0, akl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ykh0(Object obj, Object obj2, int i, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = i;
        this.d = i2;
    }

    public void accept(Object obj) {
        h2i0 h2i0Var = (h2i0) this.b;
        Surface surface = (Surface) this.e;
        ffu0 ffu0Var = (ffu0) obj;
        ((fzh0) h2i0Var.l.get()).getClass();
        if (surface == null) {
            ffu0Var.I(null);
            h2i0Var.w = null;
        } else {
            f2i0 f2i0Var = new f2i0(surface, this.c, this.d);
            h2i0Var.w = f2i0Var;
            ffu0Var.I(f2i0Var);
        }
    }

    public void f(kh70 kh70Var, int i) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                rlh0 rlh0Var = (rlh0) obj2;
                List list = (List) obj;
                rlh0Var.getClass();
                v280 v280VarM = b380.m();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    v280VarM.c(((yoh0) list.get(i2)).e(rlh0Var.o(), true));
                }
                occ occVar = new occ(v280VarM.g());
                int iO = rlh0Var.o();
                xlh0 xlh0Var = rlh0Var.c;
                int i3 = this.c;
                int i4 = this.d;
                if (iO >= 2) {
                    kh70Var.a0(xlh0Var, i, i3, i4, occVar);
                } else {
                    kh70Var.E(xlh0Var, i, i4, occVar);
                    kh70Var.G0(rlh0Var.c, i, i3, i4);
                }
                break;
            default:
                int i5 = this.d;
                kh70Var.B(((rlh0) obj2).c, i, (Surface) obj, this.c, i5);
                break;
        }
    }
}
