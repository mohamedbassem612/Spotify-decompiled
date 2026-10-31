package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iuw {
    public static final bma1 c = bma1.b.u("com.spotify.widgets.dynamicnpvwidget.wrapped.KEY_ELIGIBILITY");
    public final Context a;
    public final ut71 b;

    public iuw(Context context, ut71 ut71Var) {
        this.a = context;
        this.b = ut71Var;
    }

    public final void a(String str) {
        hma1 hma1VarEdit = this.b.b(this.a, str).edit();
        hma1VarEdit.a(c, true);
        hma1VarEdit.g();
    }
}
