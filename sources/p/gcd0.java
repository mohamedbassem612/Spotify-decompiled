package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gcd0 implements xpw {
    public final psw X;
    public final ia00 Y;
    public final mgc a;
    public final ud1 b;
    public final ng20 c;
    public final zo10 d;
    public final zo10 e;
    public final zo10 f;
    public final q8n g;
    public final q8n h;
    public final ezc i;
    public final e7m0 t;

    public gcd0(clw clwVar, mgc mgcVar, ud1 ud1Var, ng20 ng20Var, zo10 zo10Var, zo10 zo10Var2, zo10 zo10Var3, add addVar, hgd0 hgd0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = mgcVar;
        this.b = ud1Var;
        this.c = ng20Var;
        this.d = zo10Var;
        this.e = zo10Var2;
        this.f = zo10Var3;
        this.g = q8nVar;
        this.h = q8nVar2;
        this.i = yoi1.g(hgd0Var.p());
        qf4 qf4Var = addVar.a;
        boolean z = qf4Var.h() && qf4Var.B();
        ccd0 ccd0Var = new ccd0(z6x.a, ybd0.a, 0L, true, o7h.p1(ubd0.c), z, hgd0Var.j());
        xxb0 xxb0Var = xxb0.c;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(fbw.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new zjw(clwVar)));
        this.t = sbl.B(ccd0Var, xxb0Var, new a(clwVar.b, coroutinesSubtypeEffectHandlerBuilderI), x5d0.g, new fcd0(this));
        j2i j2iVar = new j2i(-981964845, new pba0(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
        this.Y = n3o1.q(this).a(i2d0.N0, i2d0.O0);
    }

    public final rqw a() {
        return this.Y;
    }

    public final jsw c() {
        return this.X;
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
