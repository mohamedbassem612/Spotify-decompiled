package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ele implements xpw {
    public final qke a;
    public final vke b;
    public final hyl0 c;
    public final oud d;
    public final e7m0 e;
    public final psw f;
    public final ia00 g;

    public ele(qke qkeVar, vke vkeVar, q8n q8nVar, hyl0 hyl0Var, oud oudVar) {
        this.a = qkeVar;
        this.b = vkeVar;
        this.c = hyl0Var;
        this.d = oudVar;
        rje rjeVar = rje.Y0;
        n4 n4Var = n4.t;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        cle cleVar = new cle(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(xke.class), runSequentially.a(cleVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(yke.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dle(this)));
        this.e = sbl.C(rjeVar, n4Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), wnb.b1, new m4d(this, (byte) 21));
        j2i j2iVar = gbi.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(new zee(this, (byte) 2), emd.Z0);
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
