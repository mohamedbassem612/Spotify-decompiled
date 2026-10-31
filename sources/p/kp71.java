package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kp71 implements xpw {
    public final eih1 N0;
    public final psw O0;
    public final d6o0 X;
    public final idd1 Y = new idd1(new ip71(this, (byte) 2));
    public final e7m0 Z;
    public final jwf0 a;
    public final add b;
    public final mxf0 c;
    public final yp71 d;
    public final tln e;
    public final z6q f;
    public final l5p g;
    public final q8n h;
    public final q8n i;
    public final cb0 t;

    public kp71(lnf lnfVar, jwf0 jwf0Var, add addVar, mxf0 mxf0Var, yp71 yp71Var, tln tlnVar, z6q z6qVar, l5p l5pVar, q8n q8nVar, q8n q8nVar2, cb0 cb0Var, w9f w9fVar, i6o0 i6o0Var) {
        this.a = jwf0Var;
        this.b = addVar;
        this.c = mxf0Var;
        this.d = yp71Var;
        this.e = tlnVar;
        this.f = z6qVar;
        this.g = l5pVar;
        this.h = q8nVar;
        this.i = q8nVar2;
        this.t = cb0Var;
        this.X = i6o0Var;
        ep71 ep71Var = new ep71(null, false, addVar.d());
        gp71 gp71Var = gp71.b;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        np71 np71Var = new np71(lnfVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vo71.class), cancelPrevious.a(np71Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uo71.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lp71(w9fVar)));
        this.Z = sbl.z(ep71Var, gp71Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), new dj71(this, (byte) 4), new jp71(this, (byte) 1));
        this.N0 = new eih1();
        j2i j2iVar = new j2i(231095151, new c771(this, (byte) 11), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.N0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final mqw getBehavior() {
        return this.Z;
    }
}
