package p;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/u2q0;", "Lp/auj;", "<init>", "()V", "src_main_java_com_spotify_album_ondemandnewreleasesbannerelement-ondemandnewreleasesbannerelement"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u2q0 extends auj {
    public lzn0 Y1;
    public int Z1;
    public tro0 a2;
    public tro0 b2;

    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
    }

    public final void n1(xtj xtjVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1893623227);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 17) != 16)) {
            nyx.a(2, (wux) null, apo.r(1966370648, new jyo0((Context) x340Var.k(AndroidCompositionLocals_androidKt.b), this, (byte) 9), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(this, xtjVar, i, (byte) 10);
        }
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.t2u*/.v0(context);
        Bundle bundle = ((zf30) this).f;
        if (bundle != null) {
            this.Z1 = bundle.getInt("days_remaining", 0);
        }
    }
}
