package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cfh0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g931 b;

    public /* synthetic */ cfh0(g931 g931Var, byte b) {
        this.a = b;
        this.b = g931Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        g931 g931Var = this.b;
        switch (b) {
            case 0:
                g931Var.o(3);
                break;
            default:
                g931Var.o(2);
                break;
        }
    }
}
