package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class enu extends hab0 implements vu30 {
    public final /* synthetic */ fnu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enu(fnu fnuVar) {
        super(2);
        this.a = fnuVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        x8c0 lifecycle = ((cir0) obj2).e().getLifecycle();
        fnu fnuVar = this.a;
        lifecycle.a(new dnu(fnuVar));
        mt81 mt81Var = fnuVar.b;
        return Mobius.d(lt81.a, mt81Var.a).c(mt81Var.b, new EventSource[]{mt81Var.c, mt81Var.d, mt81Var.e, mt81Var.f});
    }
}
