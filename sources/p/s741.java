package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s741 {
    public static final bma1 d = bma1.b("account_linking_dialog_time_first_shown");
    public static final bma1 e = bma1.b("account_linking_dialog_times_shown");
    public final ut71 a;
    public final Activity b;
    public spq0 c = j5.a;

    public s741(Activity activity, ut71 ut71Var) {
        this.a = ut71Var;
        this.b = activity;
    }

    public final int a() {
        if (this.c.c()) {
            return ((dma1) this.c.b()).l(e, 0);
        }
        jah.g("setup needs to be called first");
        return 0;
    }
}
