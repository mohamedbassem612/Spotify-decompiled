package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fpw0 implements xpw {
    public final jpw0 a;
    public final q8n b;
    public final q8n c;
    public final e7m0 d;
    public final ia00 e;
    public final psw f;

    public fpw0(qow0 qow0Var, jpw0 jpw0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = jpw0Var;
        this.b = q8nVar;
        this.c = q8nVar2;
        p7w0 p7w0Var = p7w0.T0;
        t7p0 t7p0Var = t7p0.l;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        low0 low0Var = new low0(qow0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(row0.class), runSequentially.a(low0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sow0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new mow0(qow0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(tow0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new now0(qow0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uow0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new pow0(qow0Var)));
        this.d = sbl.A(p7w0Var, t7p0Var, new a(qow0Var.e, coroutinesSubtypeEffectHandlerBuilderI), gbw0.h, new mwv0(this, (byte) 11));
        this.e = n3o1.q(this).a(nzv0.P0, nzv0.Q0);
        j2i j2iVar = v9j.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
