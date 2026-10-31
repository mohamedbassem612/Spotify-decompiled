package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cj3 {
    public static final bma1 d;
    public static final bma1 e;
    public static final bma1 f;
    public static final bma1 g;
    public final ut71 a;
    public final Activity b;
    public dma1 c;

    static {
        nbc nbcVar = bma1.b;
        d = nbcVar.u("alexa_account_linking_dialog_time_first_shown");
        e = nbcVar.u("alexa_account_linking_dialog_times_shown");
        f = nbcVar.u("alexa_account_linking_not_linked");
        g = nbcVar.u("alexa_account_linking_nudge_attempt_count");
    }

    public cj3(Activity activity, ut71 ut71Var) {
        this.a = ut71Var;
        this.b = activity;
    }

    public final int a() {
        dma1 dma1Var = this.c;
        if (dma1Var != null) {
            return dma1Var.l(e, 0);
        }
        eg.m("setup needs to be called first");
        return 0;
    }
}
