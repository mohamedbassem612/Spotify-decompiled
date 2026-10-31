package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f8i0 implements xpw {
    public final r6i0 a;
    public final f7i0 b;
    public final q8n c;
    public final hyl0 d;
    public final oud e;
    public final e7m0 f;
    public final psw g;
    public final ia00 h;

    public f8i0(r6i0 r6i0Var, f7i0 f7i0Var, q8n q8nVar, hyl0 hyl0Var, oud oudVar) {
        this.a = r6i0Var;
        this.b = f7i0Var;
        this.c = q8nVar;
        this.d = hyl0Var;
        this.e = oudVar;
        y7i0 y7i0Var = y7i0.b;
        xxb0 xxb0Var = xxb0.u;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        d8i0 d8i0Var = new d8i0(this);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(r7i0.class), runSequentially.a(d8i0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(s7i0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new e8i0(this)));
        this.f = sbl.C(y7i0Var, xxb0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), ish0.e, new c8i0(this, (byte) 1));
        j2i j2iVar = f0j.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
        this.h = n3o1.q(this).a(new pah0(this, (byte) 4), ytg0.Q0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
