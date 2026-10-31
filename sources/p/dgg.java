package p;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dgg implements CompletableSource {
    public final /* synthetic */ so a;

    public dgg(so soVar) {
        this.a = soVar;
    }

    public final void subscribe(CompletableObserver completableObserver) {
        ((md7) ((t4d1) this.a.c).b).accept(new jd7(null, null));
    }
}
