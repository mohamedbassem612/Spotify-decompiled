package p;

import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u551 extends MobiusLoopViewModel {
    public final y441 g;
    public final CompositeDisposable h;

    public u551(x551 x551Var, ov41 ov41Var, z551 z551Var, y441 y441Var) {
        super(x551Var, z551Var, ov41Var, MainThreadWorkRunner.a());
        this.g = y441Var;
        this.h = new CompositeDisposable();
    }

    public final void W() {
        this.h.dispose();
    }
}
