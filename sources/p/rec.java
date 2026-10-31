package p;

import android.graphics.Color;
import com.spotify.wrapped.v1.proto.ButtonConfiguration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rec implements jec {
    public final lzn0 a;
    public final cik1 b;
    public final qpj1 c;
    public final mub d;
    public final q9l1 e;
    public final vwm1 f;
    public final op31 g;
    public final bih1 h;
    public final hce1 i;

    public rec(lzn0 lzn0Var, cik1 cik1Var, qpj1 qpj1Var, mub mubVar, q9l1 q9l1Var, vwm1 vwm1Var, op31 op31Var, bih1 bih1Var, hce1 hce1Var) {
        this.a = lzn0Var;
        this.b = cik1Var;
        this.c = qpj1Var;
        this.d = mubVar;
        this.e = q9l1Var;
        this.f = vwm1Var;
        this.g = op31Var;
        this.h = bih1Var;
        this.i = hce1Var;
    }

    public static gec c(ButtonConfiguration.Style style) {
        String strP = style.p();
        String strR = style.r();
        strR.getClass();
        if (strR.length() <= 0) {
            strR = null;
        }
        return new gec(Integer.valueOf(Color.parseColor(style.q())), Integer.valueOf(Color.parseColor(style.n())), strP, strR);
    }

    public final hp80 b() {
        o0i o0iVar = (o0i) this.e.c.getValue();
        if (o0iVar != null) {
            return o0iVar.e;
        }
        return null;
    }
}
