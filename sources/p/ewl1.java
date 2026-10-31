package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ewl1 extends trj0 {
    public final Context c;

    public ewl1(Context context) {
        super(9, 10);
        this.c = context;
    }

    @Override // p.trj0
    public final void a(sk30 sk30Var) {
        sk30Var.f("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.c;
        qkn0.f(context, sk30Var);
        g0p1.B(context, sk30Var);
    }
}
