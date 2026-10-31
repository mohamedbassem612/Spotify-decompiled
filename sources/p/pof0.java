package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pof0 implements xpw {
    public final q8q a;
    public final e7m0 b;
    public final psw c;
    public final eih1 d;

    public pof0(lnf0 lnf0Var, epf0 epf0Var, q8n q8nVar, q8n q8nVar2, Flowable flowable, q8q q8qVar, b9y b9yVar, tbr0 tbr0Var) {
        this.a = q8qVar;
        klf0 klf0Var = klf0.X;
        dq7 dq7Var = new dq7(new mbf0(new fpf0(epf0Var.a, epf0Var.b, epf0Var.c), (byte) 6), (byte) 20);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        jof0 jof0Var = new jof0(q8nVar2, tbr0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(iof0.class), runSequentially.a(jof0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hof0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kof0(q8nVar2, b9yVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fof0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lof0(q8nVar2, tbr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gof0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new nof0(lnf0Var, flowable)));
        this.b = sbl.A(klf0Var, dq7Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), ujf0.g, new xy50(q8nVar, (byte) 12));
        j2i j2iVar = new j2i(-440063296, new qcd0(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
        this.d = new eih1();
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
