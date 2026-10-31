package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eib0 extends hab0 implements vu30 {
    public final /* synthetic */ fib0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eib0(fib0 fib0Var) {
        super(2);
        this.a = fib0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        cir0 cir0Var = (cir0) obj2;
        bib0 bib0Var = this.a.e;
        ur00 ur00Var = new ur00(cir0Var, bib0Var.a, bib0Var.d);
        yhb0 yhb0Var = new yhb0();
        phb0 phb0Var = bib0Var.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ohb0 ohb0Var = new ohb0(phb0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dhb0.class), runSequentially.a(ohb0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fhb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jhb0(phb0Var, cir0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hhb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new khb0(phb0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ehb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lhb0(ur00Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ghb0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mhb0(phb0Var)));
        MobiusLoop.Builder builderD = Mobius.d(yhb0Var, new a(phb0Var.f, coroutinesSubtypeEffectHandlerBuilderI)).b(new zhb0(bib0Var)).d(new aib0(bib0Var));
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = bib0Var.e;
        mr20[] mr20VarArr = {(mfe) ur00Var.d};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, mr20VarArr)));
    }
}
