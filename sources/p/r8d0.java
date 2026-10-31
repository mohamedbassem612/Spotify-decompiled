package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r8d0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s8d0 b;

    public /* synthetic */ r8d0(s8d0 s8d0Var, byte b) {
        this.a = b;
        this.b = s8d0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        s8d0 s8d0Var = this.b;
        switch (b) {
            case 0:
                s8d0Var.u(obj);
                break;
            default:
                s8d0Var.v((Throwable) obj);
                break;
        }
    }
}
