package p;

import android.app.Activity;
import android.app.ActivityOptions;
import android.view.View;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a4p0 implements p2p0 {
    public final dg30 a;
    public final e7p0 b;
    public final d7p0 c;

    public a4p0(dg30 dg30Var, e7p0 e7p0Var, d7p0 d7p0Var) {
        this.a = dg30Var;
        this.b = e7p0Var;
        this.c = d7p0Var;
    }

    @Override // p.p2p0
    public final void b(ou80 ou80Var) {
        e7p0 e7p0Var = this.b;
        mwn0 mwn0Var = e7p0Var.c;
        View viewFindViewById = this.a.findViewById(2131430187);
        Activity activity = e7p0Var.a;
        if (((gv4) e7p0Var.f.get()).b()) {
            e7p0Var.b(ou80Var);
            return;
        }
        if (ou80Var != null) {
            lik1 lik1Var = NowPlayingActivity.y1;
            lsn0 lsn0Var = new lsn0(NowPlayingActivity.y1.a, ou80Var);
            mwn0Var.e(lsn0Var);
            mwn0Var.f(lsn0Var);
        } else {
            jsn0 jsn0Var = jsn0.a;
            mwn0Var.e(jsn0Var);
            mwn0Var.f(jsn0Var);
        }
        e7p0Var.g.a();
        ActivityOptions activityOptionsMakeSceneTransitionAnimation = ActivityOptions.makeSceneTransitionAnimation(activity, viewFindViewById, "now_playing_view_container");
        lik1 lik1Var2 = NowPlayingActivity.y1;
        activity.startActivity(mhc.f(activity, true), activityOptionsMakeSceneTransitionAnimation.toBundle());
    }

    @Override // p.p2p0
    public final void close() {
        Function0 function0 = this.c.a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // p.p2p0
    public final void a() {
    }

    @Override // p.p2p0
    public final void c(yqq0 yqq0Var, boolean z) {
    }

    @Override // p.p2p0
    public final void d(t2u t2uVar, String str) {
    }
}
