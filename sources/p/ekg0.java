package p;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ekg0 implements Callable {
    public final /* synthetic */ gkg0 a;

    public ekg0(gkg0 gkg0Var) {
        this.a = gkg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return (Boolean) this.a.f.invoke();
    }
}
