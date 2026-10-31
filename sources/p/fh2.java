package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fh2 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hh2 b;

    public /* synthetic */ fh2(hh2 hh2Var, byte b) {
        this.a = b;
        this.b = hh2Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        hh2 hh2Var = this.b;
        switch (b) {
            case 0:
                hh2Var.c.invoke();
                break;
            default:
                hh2Var.b.invoke();
                break;
        }
    }
}
