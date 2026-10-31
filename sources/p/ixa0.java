package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ixa0 extends hab0 implements iu30 {
    public final /* synthetic */ jxa0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixa0(jxa0 jxa0Var) {
        super(1);
        this.a = jxa0Var;
    }

    public final Object invoke(Object obj) {
        gxa0 gxa0Var = this.a.c;
        xk xkVar = gxa0Var.a;
        swa0 swa0Var = gxa0Var.b;
        z710 z710Var = gxa0Var.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        zwa0 zwa0Var = new zwa0(xkVar, swa0Var, (byte) 0);
        Scheduler scheduler = AndroidSchedulers.a;
        RxAndroidPlugins.b(scheduler);
        subtypeEffectHandlerBuilderC.d(xwa0.class, zwa0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(ywa0.class, new yb50(z710Var, (byte) 1), scheduler);
        return Mobius.d(fxa0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
