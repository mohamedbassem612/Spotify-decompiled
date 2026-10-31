package p;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bjd {
    public final ynb0 a;
    public final Context b;
    public final mr20 c;
    public final g26 d;
    public final ov20 e;

    public bjd(ynb0 ynb0Var, Context context, mr20 mr20Var, g26 g26Var, ov20 ov20Var) {
        this.a = ynb0Var;
        this.b = context;
        this.c = mr20Var;
        this.d = g26Var;
        this.e = ov20Var;
    }

    public final boolean a() {
        return Build.VERSION.SDK_INT != 25 && this.d.a();
    }

    public final mr20 b() {
        if (!a()) {
            return h4p1.m(Boolean.FALSE);
        }
        bw20 bw20Var = (bw20) this.e;
        return rqt0.u(h5p1.s(hu20.e(bw20Var.b("canvas-disabled"), new b7c((lnm) null, this, (byte) 2)), this.c, bw20Var.a("allow-child-video", true), new ajd(4, null)));
    }
}
