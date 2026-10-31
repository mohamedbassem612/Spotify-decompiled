package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cdu implements Connectable {
    public final tz01 a;
    public final uj60 b;
    public final q8n c;
    public final dt71 d;
    public final ve01 e;

    public cdu(tz01 tz01Var, uj60 uj60Var, q8n q8nVar) {
        this.a = tz01Var;
        this.b = uj60Var;
        this.c = q8nVar;
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.d = dt71VarE;
        this.e = d5p1.g(dt71VarE);
    }

    public final Connection L(Consumer consumer) {
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        ycu ycuVar = new ycu(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(scu.class), runSequentially.a(ycuVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(rcu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new wcu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tcu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xcu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ucu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new bdu(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(qcu.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zcu(this)));
        return new cn(new a(this.c, coroutinesSubtypeEffectHandlerBuilderI).L(consumer), this, (byte) 18);
    }
}
