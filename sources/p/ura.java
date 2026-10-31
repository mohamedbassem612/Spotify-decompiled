package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ura implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ esa b;

    public /* synthetic */ ura(esa esaVar, byte b) {
        this.a = b;
        this.b = esaVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        esa esaVar = this.b;
        switch (b) {
            case 0:
                esaVar.l = (Disposable) obj;
                break;
            default:
                esaVar.m = (Disposable) obj;
                break;
        }
    }
}
