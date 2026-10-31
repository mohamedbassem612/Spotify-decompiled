package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l770 extends e770 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l770(fe70 fe70Var, j3a j3aVar, byte b) {
        super(fe70Var, j3aVar, uw31.class);
        this.f = b;
        switch (b) {
            case 1:
                super(fe70Var, j3aVar, tx31.class);
                break;
            default:
                break;
        }
    }

    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.f) {
            case 0:
                s7s0 s7s0VarR = t890.r(context, viewGroup, 2131625035);
                uw31 uw31Var = new uw31(s7s0VarR);
                s7s0VarR.setTag(2131429011, uw31Var);
                return uw31Var;
            default:
                s7s0 s7s0VarR2 = t890.r(context, viewGroup, 2131625039);
                ux31 ux31Var = new ux31(s7s0VarR2);
                s7s0VarR2.setTag(2131429011, ux31Var);
                return ux31Var;
        }
    }

    @Override // p.e770
    public final void i(gy31 gy31Var, y570 y570Var) {
        switch (this.f) {
            case 0:
                String str = ((id70) y570Var.n()).a.a;
                n57.j(!jhc1.F(str), "title is missing");
                ((uw31) gy31Var).h(str);
                break;
            default:
                axo1.g((tx31) gy31Var, y570Var);
                break;
        }
    }
}
