package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.extras.CompositeLogger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class axk1 extends hab0 implements vu30 {
    public final /* synthetic */ bxk1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axk1(bxk1 bxk1Var) {
        super(2);
        this.a = bxk1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ewk1 ewk1Var = this.a.d;
        return Mobius.d(new dwk1(), ewk1Var.a).f(CompositeLogger.g(new AndroidLogger(), new MobiusLoop.Logger[]{ewk1Var.b}));
    }
}
