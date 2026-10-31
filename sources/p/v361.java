package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v361 implements xpw {
    public final e7m0 a;
    public final ia00 b;
    public final psw c;

    public v361(kt91 kt91Var, Context context, r35 r35Var, q8n q8nVar, w3f w3fVar, iu30 iu30Var) {
        t361 t361Var = new t361((String) null, "", "", 0, false, s361.g, false);
        t7p0 t7p0Var = t7p0.A;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        b361 b361Var = new b361(r35Var, context, iu30Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(g361.class), cancelPrevious.a(b361Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(h361.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new c361(context, kt91Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(f361.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new e361(w3fVar)));
        this.a = sbl.B(t361Var, t7p0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), qr51.Y, hz51.g);
        this.b = n3o1.q(this).a(vp51.Y, vp51.Z);
        j2i j2iVar = dgj.b;
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
