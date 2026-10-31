package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fo7 implements tyq {
    public final q8n a;
    public final q8n b;
    public final e7m0 c;
    public final psw d;
    public final ia00 e;

    public fo7(alw alwVar, q8n q8nVar, q8n q8nVar2) {
        this.a = q8nVar;
        this.b = q8nVar2;
        co7 co7Var = new co7(1, "", null, null, true, false);
        n4 n4Var = n4.j;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        pkw pkwVar = new pkw(alwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sew.class), cancelPrevious.a(pkwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(sbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new fkw(alwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ffw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ijw(alwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xcw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new njw(alwVar)));
        this.c = sbl.B(co7Var, n4Var, new a(alwVar.e, coroutinesSubtypeEffectHandlerBuilderI), c37.t, new eo7(this));
        j2i j2iVar = o7i.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.e = n3o1.q(this).a(d27.Y, d27.Z);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.c;
    }

    public final f4r getData() {
        return i13.d;
    }
}
