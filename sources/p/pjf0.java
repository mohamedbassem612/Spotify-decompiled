package p;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pjf0 {
    public final Activity a;
    public final a1r0 b;
    public final kly0 c;
    public final mwn0 d;
    public final fwn0 e;

    public pjf0(Activity activity, a1r0 a1r0Var, gbp gbpVar, mwn0 mwn0Var, fwn0 fwn0Var) {
        this.a = activity;
        this.b = a1r0Var;
        this.c = gbpVar;
        this.d = mwn0Var;
        this.e = fwn0Var;
    }

    public final void a(tv80 tv80Var, Bundle bundle) {
        cr4 cr4Var = (cr4) this.c.get();
        if (cr4Var.a() || cr4Var.b()) {
            a1r0.m(this.b, nik1.R0.a, tv80Var, bundle, 8);
            return;
        }
        Intent intentA = this.e.a(new dwn0(nik1.R0.a, "", false, false, 0, 0, false, null, null, new bwn0(tv80Var)));
        Activity activity = this.a;
        intentA.setClassName(activity, "com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity");
        intentA.putExtra("is_internal_navigation", true);
        intentA.putExtras(bundle);
        this.d.e(gg.d(intentA));
        activity.startActivity(intentA);
    }
}
