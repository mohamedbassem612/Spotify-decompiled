package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iwd1 extends hab0 implements vu30 {
    public final /* synthetic */ jwd1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwd1(jwd1 jwd1Var) {
        super(2);
        this.a = jwd1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        gwd1 gwd1Var = this.a.c;
        String str = ((kwd1) obj).a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ewd1 ewd1Var = new ewd1(gwd1Var, str);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eaw.class), runSequentially.a(ewd1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cwd1(gwd1Var)));
        return Mobius.d(hwd1.a, new a(gwd1Var.d, coroutinesSubtypeEffectHandlerBuilderI));
    }
}
