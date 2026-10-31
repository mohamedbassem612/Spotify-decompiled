package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b580 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c580 b;

    public /* synthetic */ b580(c580 c580Var, byte b) {
        this.a = b;
        this.b = c580Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        c580 c580Var = this.b;
        switch (b) {
            case 0:
                c580Var.a.q0(true);
                break;
            default:
                c580Var.b.a((String) obj);
                break;
        }
    }
}
