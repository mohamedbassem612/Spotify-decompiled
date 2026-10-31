package p;

import android.app.Activity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x750 extends hab0 implements iu30 {
    public final /* synthetic */ y750 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x750(y750 y750Var) {
        super(1);
        this.a = y750Var;
    }

    public final Object invoke(Object obj) {
        w750 w750Var = this.a.b;
        Activity activity = w750Var.a;
        f0b0 f0b0Var = w750Var.b;
        lzn0 lzn0Var = w750Var.c;
        Scheduler scheduler = w750Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.a(t9w.class, new t750(activity, (byte) 0));
        subtypeEffectHandlerBuilderC.g(few.class, new u750(f0b0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.d(iaw.class, new f5b(lzn0Var, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.d(adw.class, new f5b(lzn0Var, (byte) 5), scheduler);
        return Mobius.d(v750.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
