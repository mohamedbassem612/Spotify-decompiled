package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x8j1 implements wpw {
    public final e7m0 N0;
    public final ia00 O0;
    public final nsw P0;
    public final j2x X;
    public final rzo0 Y;
    public final op0 Z;
    public final q8n a;
    public final g01 b;
    public final myq0 c;
    public final vi11 d;
    public final iac0 e;
    public final fta f;
    public final hs00 g;
    public final pxc h;
    public final d7j1 i;
    public final m4c t;

    public x8j1(q8n q8nVar, g01 g01Var, myq0 myq0Var, vi11 vi11Var, iac0 iac0Var, fta ftaVar, hs00 hs00Var, pxc pxcVar, d7j1 d7j1Var, m4c m4cVar, j2x j2xVar, rzo0 rzo0Var, op0 op0Var) {
        this.a = q8nVar;
        this.b = g01Var;
        this.c = myq0Var;
        this.d = vi11Var;
        this.e = iac0Var;
        this.f = ftaVar;
        this.g = hs00Var;
        this.h = pxcVar;
        this.i = d7j1Var;
        this.t = m4cVar;
        this.X = j2xVar;
        this.Y = rzo0Var;
        this.Z = op0Var;
        HashMap map = j2xVar.a;
        Object obj = map.get("muted");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        Object obj2 = map.get("position");
        Long l = obj2 instanceof Long ? (Long) obj2 : null;
        f8j1 f8j1Var = new f8j1(zBooleanValue, null, null, null, l != null ? l.longValue() : 0L, 126);
        rve0 rve0Var = new rve0(this);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially = new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially();
        i8j1 i8j1Var = new i8j1(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(j7j1.class), coroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially.a(i8j1Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(e7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new j8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new k8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new l8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new m8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new n8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new o8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new p8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(i7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially().a(new q8j1(this)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m7j1.class), new CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$CancelPrevious().a(new s8j1(this)));
        this.N0 = brl.u(f8j1Var, rve0Var, new com.spotify.mobius.coroutines.a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI), new fc3(this, (byte) 25), new h8j1(this));
        this.O0 = n3o1.q(this).a(bnx0.Y, new zyf1(this, (byte) 16));
        this.P0 = jch0.j(new i6a(this, (byte) 6));
    }

    public static final void e(x8j1 x8j1Var, iu30 iu30Var) {
        c921.y(cto1.q(x8j1Var.e), x8j1Var.a, 0, new w73(iu30Var, (lnm) null, (byte) 21), 2);
    }

    public final rqw a() {
        return this.O0;
    }

    public final rsw c() {
        return this.P0;
    }

    public final boolean f(y8j1 y8j1Var) {
        qm60 qm60Var = qm60.d;
        ji0 ji0VarA = y8j1Var.a();
        fta ftaVar = this.f;
        ftaVar.v(qm60Var, ji0VarA);
        boolean zIsEmpty = y8j1Var.a().g.a().isEmpty();
        if (zIsEmpty) {
            ftaVar.v(new um60("invalid_config", new Exception("Ad invalid")), y8j1Var.a());
        }
        return zIsEmpty;
    }

    public final mqw getBehavior() {
        return this.N0;
    }
}
