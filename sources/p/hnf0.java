package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hnf0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lnf0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hnf0(lnf0 lnf0Var, String str, String str2, byte b) {
        this.a = b;
        this.b = lnf0Var;
        this.c = str;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.c;
        lnf0 lnf0Var = this.b;
        switch (b) {
            case 0:
                lnf0Var.c.a.d(str, (a9h) obj);
                break;
            default:
                lnf0Var.c.a.d(str, (a9h) obj);
                break;
        }
    }
}
