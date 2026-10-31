package p;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pfn0 {
    public final AtomicReference a = new AtomicReference(null);
    public final xgn0 b = ygn0.a();

    public final Object a(hfn0 hfn0Var, iu30 iu30Var, onm onmVar) {
        return smo1.s(new ae1(hfn0Var, this, iu30Var, (lnm) null, (byte) 14), onmVar);
    }

    public final void b(mfn0 mfn0Var) {
        AtomicReference atomicReference;
        mfn0 mfn0Var2;
        do {
            atomicReference = this.a;
            mfn0Var2 = (mfn0) atomicReference.get();
            if (mfn0Var2 != null && mfn0Var.a.compareTo(mfn0Var2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!cfm0.p(atomicReference, mfn0Var2, mfn0Var));
        if (mfn0Var2 != null) {
            mfn0Var2.b.d(new MutationInterruptedException());
        }
    }
}
