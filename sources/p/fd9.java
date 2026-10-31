package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fd9 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oir b;

    public /* synthetic */ fd9(oir oirVar, byte b) {
        this.a = b;
        this.b = oirVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        oir oirVar = this.b;
        switch (b) {
            case 0:
                oirVar.d.onNext(Long.valueOf(((bd9) obj).a));
                break;
            default:
                oirVar.a.onNext(((cd9) obj).a);
                break;
        }
    }
}
