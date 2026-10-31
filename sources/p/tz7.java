package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tz7 {
    public final Context a;
    public final yqg b;
    public final cxc c;
    public final mw7 d;

    public tz7(Context context, yqg yqgVar, cxc cxcVar, mw7 mw7Var) {
        this.a = context;
        this.b = yqgVar;
        this.c = cxcVar;
        this.d = mw7Var;
    }

    public final z6m0 a(x8c0 x8c0Var) {
        Context context = this.a;
        yo00 yo00VarA = new bo00(context.getApplicationContext(), new sz7(this)).a();
        Context applicationContext = context.getApplicationContext();
        dzp0 dzp0Var = new dzp0(this.c, (byte) 1);
        dzp0Var.d = "preview-player-lib";
        return new z6m0(this.b, yo00VarA, new zjx0(new lbq(applicationContext, dzp0Var)), new g23(this.d), x8c0Var);
    }
}
