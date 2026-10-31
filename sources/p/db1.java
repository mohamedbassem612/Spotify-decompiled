package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class db1 extends hab0 implements iu30 {
    public final /* synthetic */ eb1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db1(eb1 eb1Var) {
        super(1);
        this.a = eb1Var;
    }

    public final Object invoke(Object obj) {
        ab1 ab1Var = this.a.b;
        xa1 xa1Var = new xa1();
        aa1 aa1Var = ab1Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        r91 r91Var = new r91(aa1Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k81.class), cancelPrevious.a(r91Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new t91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(t81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new l91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(u81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunConcurrently().a(new v91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new n91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new p91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new f91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(q81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new g91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new h91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new i91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new x91(aa1Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n81.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new z91(aa1Var)));
        return Mobius.d(xa1Var, new a(aa1Var.b, coroutinesSubtypeEffectHandlerBuilderI)).b(new ya1(ab1Var)).d(new za1(ab1Var));
    }
}
