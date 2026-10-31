package p;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z3c implements fyf0 {
    public final Activity a;
    public final w62 b;
    public final lzn0 c;

    public z3c(Activity activity, w62 w62Var, lzn0 lzn0Var) {
        this.a = activity;
        this.b = w62Var;
        this.c = lzn0Var;
    }

    public final boolean b(Intent intent) {
        return this.b.l(intent, this.a, new ptb(this, (byte) 3));
    }
}
