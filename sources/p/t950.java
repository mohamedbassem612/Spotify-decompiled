package p;

import android.app.Activity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t950 extends hab0 implements iu30 {
    public final /* synthetic */ u950 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t950(u950 u950Var) {
        super(1);
        this.a = u950Var;
    }

    public final Object invoke(Object obj) {
        r950 r950Var = this.a.b;
        Activity activity = r950Var.a;
        lzn0 lzn0Var = r950Var.b;
        f0b0 f0b0Var = r950Var.c;
        Scheduler scheduler = r950Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(e9w.class, new u750(f0b0Var, (byte) 3));
        subtypeEffectHandlerBuilderC.a(q9w.class, new t750(activity, (byte) 2));
        subtypeEffectHandlerBuilderC.d(haw.class, new f5b(lzn0Var, (byte) 6), scheduler);
        return Mobius.d(q950.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
