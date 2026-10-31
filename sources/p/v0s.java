package p;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v0s implements w560, x560 {
    public final t0s a;
    public final Context b;
    public final lly0 c;
    public final Set d;
    public final Executor e;

    public v0s(Context context, String str, Set set, lly0 lly0Var, Executor executor) {
        this.a = new t0s(context, str);
        this.d = set;
        this.e = executor;
        this.c = lly0Var;
        this.b = context;
    }

    public final hfp1 a() {
        if (!vqo1.h(this.b)) {
            return o0c.z("");
        }
        return o0c.i(this.e, new u0s(this, (byte) 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            o0c.z((Object) null);
        } else if (!vqo1.h(this.b)) {
            o0c.z((Object) null);
        } else {
            o0c.i(this.e, new lhn(this, (byte) 1));
        }
    }
}
