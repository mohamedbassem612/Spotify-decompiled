package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yb50 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z710 b;

    public /* synthetic */ yb50(z710 z710Var, byte b) {
        this.a = b;
        this.b = z710Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        z710 z710Var = this.b;
        switch (b) {
            case 0:
                z710.d(z710Var, ((wb50) obj).a, false, 6);
                break;
            default:
                z710.d(z710Var, ((ywa0) obj).a, false, 6);
                break;
        }
    }
}
