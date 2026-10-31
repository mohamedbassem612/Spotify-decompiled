package p;

import android.content.res.Resources;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kc50 extends hab0 implements vu30 {
    public final /* synthetic */ lc50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc50(lc50 lc50Var) {
        super(2);
        this.a = lc50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ic50 ic50Var = this.a.c;
        tbr0 tbr0VarC = ((cir0) obj2).c();
        f0b0 f0b0Var = ic50Var.a;
        z710 z710Var = ic50Var.b;
        kt91 kt91Var = ic50Var.c;
        Resources resources = ic50Var.d;
        Scheduler scheduler = ic50Var.e;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(xb50.class, new u750(f0b0Var, (byte) 5));
        subtypeEffectHandlerBuilderC.d(wb50.class, new yb50(z710Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(vb50.class, new qg7(tbr0VarC, kt91Var, resources, (byte) 13), scheduler);
        return Mobius.d(hc50.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
    }
}
