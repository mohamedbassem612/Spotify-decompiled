package p;

import android.net.nsd.NsdServiceInfo;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t4g0 implements jap0 {
    @Override // p.jap0
    public final int a() {
        return 10;
    }

    @Override // p.jap0
    public final Maybe b(NsdServiceInfo nsdServiceInfo) {
        if (r110.a(nsdServiceInfo)) {
            return Maybe.e(nsdServiceInfo);
        }
        MaybeEmpty maybeEmpty = MaybeEmpty.a;
        maybeEmpty.getClass();
        return maybeEmpty;
    }
}
