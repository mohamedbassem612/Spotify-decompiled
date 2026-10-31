package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o801 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p801 b;

    public /* synthetic */ o801(p801 p801Var, byte b) {
        this.a = b;
        this.b = p801Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        p801 p801Var = this.b;
        switch (b) {
            case 0:
                p801Var.a.a(true);
                break;
            case 1:
                p801Var.a.a(false);
                break;
            default:
                sbg1 sbg1Var = (sbg1) obj;
                zde1 zde1Var = p801Var.c;
                int i = sbg1Var.a;
                int i2 = sbg1Var.b;
                zde1Var.a.m((Object) null, Integer.valueOf(i));
                zde1Var.c.m((Object) null, Integer.valueOf(i2));
                break;
        }
    }
}
