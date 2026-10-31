package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zue extends hab0 implements vu30 {
    public final /* synthetic */ ave a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zue(ave aveVar) {
        super(2);
        this.a = aveVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        tbr0 tbr0VarC = ((cir0) obj2).c();
        ave aveVar = this.a;
        jue jueVar = aveVar.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        due dueVar = new due(jueVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cue.class), runSequentially.a(dueVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bue.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new eue(jueVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yte.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new fue(jueVar, tbr0VarC)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zte.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gue(jueVar, tbr0VarC)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(aue.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hue(jueVar, tbr0VarC)));
        return Mobius.d(wue.a, new a(jueVar.e, coroutinesSubtypeEffectHandlerBuilderI)).d(new xue(aveVar)).b(new yue(aveVar)).c(aveVar.b, new EventSource[]{aveVar.e});
    }
}
