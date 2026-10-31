package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rra implements Action {
    public final /* synthetic */ esa a;

    public rra(esa esaVar) {
        this.a = esaVar;
    }

    public final void run() {
        esa esaVar = this.a;
        Disposable disposable = esaVar.m;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = esaVar.l;
        if (disposable2 != null) {
            disposable2.dispose();
        }
    }
}
