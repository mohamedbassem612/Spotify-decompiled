package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dx71 {
    public final bfd a;
    public final kt91 b;
    public final aas c;
    public final mko d;
    public final xrc0 e;
    public final q8n f;
    public final a g;

    public dx71(bfd bfdVar, kt91 kt91Var, aas aasVar, mko mkoVar, xrc0 xrc0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = bfdVar;
        this.b = kt91Var;
        this.c = aasVar;
        this.d = mkoVar;
        this.e = xrc0Var;
        this.f = q8nVar;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        cx71 cx71Var = new cx71(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pw71.class), cancelPrevious.a(cx71Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rw71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new vw71(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nw71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xw71(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tw71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yw71(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sw71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ax71(this)));
        this.g = new a(q8nVar2, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
