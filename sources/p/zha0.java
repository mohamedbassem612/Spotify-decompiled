package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zha0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aia0 b;

    public /* synthetic */ zha0(aia0 aia0Var, byte b) {
        this.a = b;
        this.b = aia0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        aia0 aia0Var = this.b;
        switch (b) {
            case 0:
                aia0Var.c("Playback failed", (Throwable) obj);
                break;
            default:
                Throwable th = (Throwable) obj;
                aia0Var.N0.a(aia0Var.Z.take(1L).observeOn(aia0Var.g).subscribe(new yha0(aia0Var, th, (byte) 0), new yha0(aia0Var, th, (byte) 1)));
                break;
        }
    }
}
