package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gyk1 extends hab0 implements vu30 {
    public final /* synthetic */ hyk1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyk1(hyk1 hyk1Var) {
        super(2);
        this.a = hyk1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        dyk1 dyk1Var = this.a.f;
        MobiusLoop.Builder builderD = Mobius.d(new cyk1(), dyk1Var.a);
        xp41 xp41Var = dyk1Var.b;
        return builderD.h(RxEventSources.a(new ObservableSource[]{yoi1.i(new any(hu20.c(xp41Var.b.a, new wp41(xp41Var, null, (byte) 0)), (byte) 18), xp41Var.c)})).f(CompositeLogger.g(new AndroidLogger(), new MobiusLoop.Logger[]{dyk1Var.c}));
    }
}
