package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xn6 extends hab0 implements vu30 {
    public final /* synthetic */ zn6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn6(zn6 zn6Var) {
        super(2);
        this.a = zn6Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        un6 un6Var = this.a.d;
        lzn0 lzn0Var = un6Var.a;
        y1t0 y1t0Var = un6Var.b;
        y1x0 y1x0Var = un6Var.c;
        em3 em3Var = un6Var.d;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ay6 ay6Var = new ay6(lzn0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mn6.class), runSequentially.a(ay6Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nn6.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new by6(y1t0Var, y1x0Var, em3Var)));
        return gvg.d("ArtistEventsPage", Mobius.d(tn6.a, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI)));
    }
}
