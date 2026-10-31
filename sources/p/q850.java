package p;

import android.app.Activity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q850 extends hab0 implements iu30 {
    public final /* synthetic */ s850 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q850(s850 s850Var) {
        super(1);
        this.a = s850Var;
    }

    public final Object invoke(Object obj) {
        o850 o850Var = this.a.b;
        Activity activity = o850Var.a;
        f0b0 f0b0Var = o850Var.b;
        iro iroVar = o850Var.c;
        lzn0 lzn0Var = o850Var.d;
        kt91 kt91Var = o850Var.e;
        Scheduler scheduler = o850Var.f;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(ufw.class, new u750(f0b0Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(eew.class, new u750(f0b0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.d(udw.class, new l850(iroVar, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(baw.class, new lgr(lzn0Var, kt91Var, (byte) 21), scheduler);
        subtypeEffectHandlerBuilderC.a(p9w.class, new t750(activity, (byte) 1));
        return Mobius.d(n850.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
