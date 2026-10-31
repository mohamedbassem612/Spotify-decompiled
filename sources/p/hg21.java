package p;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hg21 extends hgh {
    public final /* synthetic */ byte W0;
    public final Object X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg21(qzh qzhVar, byte b) {
        super(qzhVar.getView(), rc11.a.b(ikh.class));
        this.W0 = b;
        switch (b) {
            case 1:
                super(qzhVar.getView(), rc11.a.b(okh.class));
                this.X0 = qzhVar;
                break;
            default:
                this.X0 = qzhVar;
                break;
        }
    }

    @Override // p.hgh
    public final void F(pkh pkhVar, int i, qka qkaVar) {
        byte b = this.W0;
        Object obj = this.X0;
        switch (b) {
            case 0:
                ((qzh) obj).n(new ju01((ikh) pkhVar, i, qkaVar, (byte) 2));
                break;
            case 1:
                ((qzh) obj).n(new ju01(i, (okh) pkhVar, qkaVar, (byte) 10));
                break;
            default:
                break;
        }
    }

    @Override // p.hgh
    public final void G(pkh pkhVar, int i, boolean z, String str) {
        byte b = this.W0;
        Object obj = this.X0;
        switch (b) {
            case 0:
                ikh ikhVar = (ikh) pkhVar;
                ((qzh) obj).f(new gg21(ikhVar.c, ikhVar.d));
                break;
            case 1:
                okh okhVar = (okh) pkhVar;
                ((qzh) obj).f(new zih(okhVar.c, okhVar.d));
                break;
            default:
                r961 r961Var = (r961) obj;
                ((TextView) r961Var.d).setText(((ConstraintLayout) r961Var.b).getContext().getString(((nkh) pkhVar).b == 1 ? 2131961626 : 2131961621));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg21(r961 r961Var) {
        super((ConstraintLayout) r961Var.b, rc11.a.b(nkh.class));
        this.W0 = (byte) 2;
        this.X0 = r961Var;
    }
}
