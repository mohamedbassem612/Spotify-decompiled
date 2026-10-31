package p;

import android.app.Activity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fb50 extends hab0 implements iu30 {
    public final /* synthetic */ gb50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb50(gb50 gb50Var) {
        super(1);
        this.a = gb50Var;
    }

    public final Object invoke(Object obj) {
        db50 db50Var = this.a.b;
        Activity activity = db50Var.a;
        lzn0 lzn0Var = db50Var.b;
        Scheduler scheduler = db50Var.c;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.a(r9w.class, new t750(activity, (byte) 3));
        subtypeEffectHandlerBuilderC.d(fdw.class, new f5b(lzn0Var, (byte) 7), scheduler);
        return Mobius.d(cb50.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
