package p;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lg81 extends o6 {
    public final fh81 N0;
    public final /* synthetic */ mg81 O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg81(mg81 mg81Var, Context context, fh81 fh81Var) {
        super(context, (AttributeSet) null, 6, 0);
        this.O0 = mg81Var;
        this.N0 = fh81Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1287260743);
        int i2 = (x340Var.g(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qsw.c(new obk1(this), apo.r(563986010, new kg81(this.O0, this, (byte) 2), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(this, i, (byte) 14);
        }
    }
}
