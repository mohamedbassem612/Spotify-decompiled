package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xbu implements Connectable {
    public final ps7 a;
    public final vnd1 b;
    public final yqg c;
    public final q8n d;

    public xbu(ps7 ps7Var, vnd1 vnd1Var, yqg yqgVar, q8n q8nVar) {
        this.a = ps7Var;
        this.b = vnd1Var;
        this.c = yqgVar;
        this.d = q8nVar;
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        sbu sbuVar = new sbu(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(obu.class), runSequentially.a(sbuVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qbu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new tbu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nbu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ubu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(pbu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wbu(this)));
        return new cn(new a(this.d, coroutinesSubtypeEffectHandlerBuilderI).L(consumer), this, (byte) 17);
    }
}
