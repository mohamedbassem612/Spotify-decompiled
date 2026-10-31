package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class has implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ias b;

    public /* synthetic */ has(ias iasVar, byte b) {
        this.a = b;
        this.b = iasVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ias iasVar = this.b;
        switch (b) {
            case 0:
                iasVar.i();
                break;
            default:
                iasVar.h((Throwable) obj);
                break;
        }
    }
}
