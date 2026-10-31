package p;

import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gsc0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mwt0 b;

    public /* synthetic */ gsc0(mwt0 mwt0Var, byte b) {
        this.a = b;
        this.b = mwt0Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                c2u0.a((c2u0) obj, "ListEndpointImpl.play", this.b, 8);
                break;
            default:
                mwt0 mwt0Var = this.b;
                e2u0 e2u0Var = (c2u0) obj;
                if (e2u0Var.c) {
                    if (!e2u0Var.b.d()) {
                        e2u0Var.b();
                    } else {
                        e2u0.c(e2u0Var, "cancelled", mwt0Var, (String) null, (Long) null, 12);
                    }
                    break;
                }
                break;
        }
    }
}
