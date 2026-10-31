package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cbd0 implements xpw {
    public final dbd0 a;
    public final q8n b;
    public final q8n c;
    public final String d;
    public final e7m0 e;
    public final psw f;
    public final ia00 g;

    public cbd0(blw blwVar, dbd0 dbd0Var, q8n q8nVar, q8n q8nVar2, String str) {
        this.a = dbd0Var;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.d = str;
        b7x b7xVar = b7x.a;
        yad0 yad0Var = new yad0(b7xVar, b7xVar, iad0.a);
        dq7 dq7Var = new dq7(this, (byte) 17);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        ajw ajwVar = new ajw(blwVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(hbw.class), cancelPrevious.a(ajwVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ndw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new xiw(blwVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cdw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new yiw(blwVar)));
        this.e = sbl.B(yad0Var, dq7Var, new a(blwVar.c, coroutinesSubtypeEffectHandlerBuilderI), new abd0(this, (byte) 0), new l6d0(this, (byte) 6));
        j2i j2iVar = uvi.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(new bt70(this, (byte) 27), i2d0.Z);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
