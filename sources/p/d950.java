package p;

import android.app.Activity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d950 extends hab0 implements iu30 {
    public final /* synthetic */ e950 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d950(e950 e950Var) {
        super(1);
        this.a = e950Var;
    }

    public final Object invoke(Object obj) {
        b950 b950Var = this.a.b;
        Activity activity = b950Var.a;
        wza0 wza0Var = b950Var.b;
        Observer observer = b950Var.c;
        iwe0 iwe0Var = b950Var.d;
        lzn0 lzn0Var = b950Var.e;
        Scheduler scheduler = b950Var.f;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(abw.class, new z850(wza0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.d(nfw.class, new lgr(lzn0Var, activity, iwe0Var), scheduler);
        subtypeEffectHandlerBuilderC.d(saw.class, new lgr(lzn0Var, observer, (byte) 22), scheduler);
        return Mobius.d(a950.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
