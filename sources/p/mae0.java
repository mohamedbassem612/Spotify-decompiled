package p;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mae0 implements o6r0, n6r0 {
    public n6r0 a;
    public final Disposable b;

    public mae0(eqo eqoVar) {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.a = yon1.G1("PODCAST_SHOW_LOADING", "podcast/show/loading", 1498, "podcast");
        this.b = eqoVar.a.filter(o610.Y).map(c710.X).subscribe(new rwa0(this, (byte) 10));
    }

    public final String a() {
        return this.a.a();
    }

    public final void b() {
        this.b.dispose();
    }

    public final n6r0 e() {
        return this.a;
    }

    public final String path() {
        return this.a.path();
    }
}
