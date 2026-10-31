package p;

import android.app.Activity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rb50 extends hab0 implements vu30 {
    public final /* synthetic */ sb50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb50(sb50 sb50Var) {
        super(2);
        this.a = sb50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        pb50 pb50Var = this.a.d;
        Activity activity = pb50Var.a;
        iro iroVar = pb50Var.b;
        f0b0 f0b0Var = pb50Var.c;
        Scheduler scheduler = pb50Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(d9w.class, new u750(f0b0Var, (byte) 4));
        subtypeEffectHandlerBuilderC.d(sdw.class, new l850(iroVar, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.a(s9w.class, new t750(activity, (byte) 4));
        return Mobius.d(ob50.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
