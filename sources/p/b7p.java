package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b7p {
    public final vi2 a;
    public final jly0 b = iy81.a(new z1p(this, (byte) 28));

    public b7p(vi2 vi2Var) {
        this.a = vi2Var;
    }

    public final h690 a() {
        vi2 vi2Var = this.a;
        return new h690((Flowable) vi2Var.d.get(), (Scheduler) vi2Var.f.get(), (yqg) vi2Var.e.get());
    }
}
