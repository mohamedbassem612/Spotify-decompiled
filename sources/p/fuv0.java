package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fuv0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rrv0 b;

    public /* synthetic */ fuv0(rrv0 rrv0Var, byte b) {
        this.a = b;
        this.b = rrv0Var;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.g("hubs");
                return;
            case 1:
                rrv0 rrv0Var = this.b;
                synchronized (rrv0Var) {
                    rrv0Var.b("offers_request");
                    rrv0.j(rrv0Var, "response_decode_map");
                }
                return;
            case 2:
                this.b.a();
                return;
            case 3:
                rrv0 rrv0Var2 = this.b;
                synchronized (rrv0Var2) {
                    rrv0Var2.c("load_failed");
                }
                return;
            case 4:
                this.b.g("premium_marketing");
                return;
            case 5:
                rrv0 rrv0Var3 = this.b;
                synchronized (rrv0Var3) {
                    rrv0Var3.b("offers_request");
                    rrv0.j(rrv0Var3, "response_decode_map");
                }
                return;
            case 6:
                this.b.a();
                return;
            default:
                rrv0 rrv0Var4 = this.b;
                synchronized (rrv0Var4) {
                    rrv0Var4.c("load_failed");
                }
                return;
        }
    }
}
