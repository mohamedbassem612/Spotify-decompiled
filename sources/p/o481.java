package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o481 implements Consumer {
    public final /* synthetic */ byte a;
    public final wr00 b;

    public /* synthetic */ o481(wr00 wr00Var, byte b) {
        this.a = b;
        this.b = wr00Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        wr00 wr00Var = this.b;
        switch (b) {
            case 0:
                wr00Var.a(((hfw) obj).a);
                break;
            default:
                wr00Var.a(((gf7) obj).d);
                break;
        }
    }
}
