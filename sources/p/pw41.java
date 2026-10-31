package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pw41 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rw41 b;

    public /* synthetic */ pw41(rw41 rw41Var, byte b) {
        this.a = b;
        this.b = rw41Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        rw41 rw41Var = this.b;
        switch (b) {
            case 0:
                v751 v751Var = rw41Var.e;
                int i = ((ow41) obj).a;
                long j = i;
                if (i == v751Var.e) {
                    v751Var.f = j;
                    v751Var.h = v751Var.g;
                    v751Var.i = null;
                    break;
                }
                break;
            default:
                ow41 ow41Var = (ow41) obj;
                v751 v751Var2 = rw41Var.e;
                int i2 = ow41Var.a;
                v751Var2.b(i2, i2, ow41Var.c, ow41Var.d, new rl21(rw41Var, ow41Var, (byte) 16));
                break;
        }
    }
}
