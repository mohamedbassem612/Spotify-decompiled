package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fz11 implements f961, luk {
    public final lw21 a;

    public fz11(lw21 lw21Var) {
        this.a = lw21Var;
    }

    public final pdy0 e(ydy0 ydy0Var) {
        pdy0 pdy0VarE = this.a.e(ydy0Var);
        Logger.k(cy30.p("Property from <", pdy0VarE.getClass().getSimpleName(), "> is incorrectly used from BackgroundScope.\nThe following properties will risk invalid exposure data: ", o7h.y0(pdy0VarE.models(), ",", (String) null, (String) null, ou11.d1, 30), "\nProperties are not supported for services in the BackgroundScope.For more info; see http://go/remoteconfig-android-docs/lifecycle/#accessing-properties-before-activation"), new Object[0]);
        return pdy0VarE;
    }

    public final Object getApi() {
        return this;
    }

    public final void shutdown() {
    }
}
