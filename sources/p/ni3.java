package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ni3 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi3 b;

    public /* synthetic */ ni3(pi3 pi3Var, byte b) {
        this.a = b;
        this.b = pi3Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ki3 ki3Var = ki3.d;
        pi3 pi3Var = this.b;
        switch (b) {
            case 0:
                pi3Var.c2 = ki3Var;
                pi3Var.l1();
                break;
            case 1:
                if (((vi3) obj) instanceof ti3) {
                    pi3Var.d2 = true;
                    pi3Var.c2 = ki3.b;
                    pi3Var.l1();
                }
                break;
            default:
                pi3Var.c2 = ki3Var;
                pi3Var.l1();
                break;
        }
    }
}
