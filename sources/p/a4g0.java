package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a4g0 implements xpw {
    public final e7m0 a;
    public final ia00 b;
    public final psw c;

    public a4g0(q8n q8nVar, sqa0 sqa0Var) {
        drm1 drm1Var = new drm1((byte) 27);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(l3g0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new z3g0(sqa0Var)));
        a aVar = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
        this.a = new e7m0(j2g0.f, new w6m0(drm1Var, (byte) 0), aVar, ujf0.Q0, new cas());
        this.b = n3o1.q(this).a(clf0.Z, clf0.N0);
        j2i j2iVar = nyi.a;
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
