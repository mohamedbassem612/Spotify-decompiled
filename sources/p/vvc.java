package p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vvc implements dwo {
    public static final bma1 e = bma1.b.u("cal_user");
    public final kly0 a;
    public final Context b;
    public final kly0 c;
    public final llm d;

    public vvc(kly0 kly0Var, Context context, kly0 kly0Var2, q8n q8nVar) {
        this.a = kly0Var;
        this.b = context;
        this.c = kly0Var2;
        llm llmVarE = smo1.e(ilo1.B(q8nVar, op71.f()));
        this.d = llmVarE;
        try {
            c921.y(llmVarE, (o8n) null, 0, new hsc(this, new ComponentName(context.getPackageName(), "com.spotify.carapplibrary.androidauto.AndroidAutoService"), (lnm) null, (byte) 3), 3);
        } catch (Throwable unused) {
        }
    }

    public final void shutdown() {
        smo1.q(this.d);
    }
}
