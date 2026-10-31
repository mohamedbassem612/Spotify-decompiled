package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.spotify.nowplaying.uiusecases.pager.TrackCarouselNowPlaying;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dvs implements TrackCarouselNowPlaying {
    public final pkf1 a;
    public final r4u b;

    public dvs(Context context) {
        pkf1 pkf1Var = new pkf1(context, (AttributeSet) null, 0);
        pkf1Var.r2 = udf1.Q0;
        this.a = pkf1Var;
        this.b = r4u.c(new r4u[]{r4u.d(qbo1.V0, r4u.a(new lqr(pkf1Var, (byte) 10))), r4u.d(cxo1.X0, r4u.a(new a0m(pkf1Var, (byte) 23))), r4u.d(o9p1.Y0, r4u.a(new wcr(pkf1Var, (byte) 15))), r4u.d(vap1.W0, r4u.a(new xap((Object) pkf1Var, (byte) 17)))});
    }

    public final void f(Object obj) {
        gkf1 gkf1Var = (gkf1) obj;
        if (!gkf1Var.e) {
            this.b.e(gkf1Var);
        } else {
            this.a.D0(gkf1Var.a, true);
        }
    }

    public final View getView() {
        return this.a;
    }

    public final void n(iu30 iu30Var) {
        this.a.setOnSwipeListener$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(iu30Var);
    }

    @Override // com.spotify.nowplaying.uiusecases.pager.TrackCarouselNowPlaying
    public final void q(r3g1 r3g1Var) {
        this.a.setAdapter$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(r3g1Var);
    }
}
