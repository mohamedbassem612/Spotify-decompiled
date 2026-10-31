package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ogf0 implements xpw {
    public final q8n a;
    public final b9y b;
    public final oud c;
    public final e7m0 d;
    public final psw e;
    public final eih1 f;

    public ogf0(q8n q8nVar, q8n q8nVar2, ekb ekbVar, b9y b9yVar, oud oudVar) {
        this.a = q8nVar2;
        this.b = b9yVar;
        this.c = oudVar;
        z1f0 z1f0Var = z1f0.N0;
        xxb0 xxb0Var = xxb0.k;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        mgf0 mgf0Var = new mgf0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(egf0.class), runSequentially.a(mgf0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dgf0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ngf0(this)));
        this.d = sbl.A(z1f0Var, xxb0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), x5d0.e1, new e4f0(q8nVar, (byte) 5));
        j2i j2iVar = new j2i(-1686450982, new qcd0(this, (byte) 12), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.f = new eih1();
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
