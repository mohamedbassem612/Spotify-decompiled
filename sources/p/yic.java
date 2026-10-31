package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.CappingState;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yic {
    public final nmd a;

    public yic(nmd nmdVar) {
        this.a = nmdVar;
    }

    public final void a() {
        qyo1.x(this.a.a, false, true, new rs7(1, (byte) 20));
    }

    public final void b(String str) {
        qyo1.x(this.a.a, false, true, new w8c(str, (byte) 10));
    }

    public final MaybeMap c() {
        nmd nmdVar = this.a;
        return m5n1.n(nmdVar.a, new m4d(nmdVar, (byte) 4)).f(xic.a);
    }

    public final void d(String str, CappingState cappingState) {
        k0j0 k0j0Var = new k0j0(str, cappingState);
        nmd nmdVar = this.a;
        qyo1.x(nmdVar.a, false, true, new ztb(nmdVar, k0j0Var, (byte) 14));
    }
}
