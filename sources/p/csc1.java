package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class csc1 {
    public final Activity a;
    public final lzn0 b;
    public final a1r0 c;

    public csc1(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = a1r0Var;
    }

    public final void a(tv80 tv80Var) {
        dwn0 dwn0Var = new dwn0("spotify:nowplaying:video-settings:subtitles", "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null);
        Activity activity = this.a;
        lzn0 lzn0Var = this.b;
        if (lzn0Var.j(activity)) {
            lzn0Var.f(dwn0Var);
        } else {
            a1r0.e(this.c, dwn0Var, (Bundle) null, 6);
        }
    }
}
