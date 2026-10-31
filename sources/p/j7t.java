package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j7t implements xpw {
    public final e7m0 a;
    public final ia00 b;
    public final psw c;

    public j7t(w7t w7tVar, tbr0 tbr0Var) {
        z6t z6tVar = z6t.h;
        t2m t2mVar = t2m.i;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        v7t v7tVar = new v7t(w7tVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l7t.class), runSequentially.a(v7tVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k7t.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new q7t(w7tVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(m7t.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new r7t(w7tVar, tbr0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o7t.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new s7t(w7tVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n7t.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new t7t(w7tVar)));
        this.a = new e7m0(z6tVar, new w6m0(t2mVar, (byte) 0), new a(w7tVar.f, coroutinesSubtypeEffectHandlerBuilderI), szr.X0, new cas());
        this.b = n3o1.q(this).a(v0t.t, v0t.X);
        j2i j2iVar = wii.a;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
