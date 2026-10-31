package p;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fs20 extends fn41 {
    public final boolean V(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return R(th);
    }
}
