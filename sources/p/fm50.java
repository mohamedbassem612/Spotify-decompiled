package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fm50 implements xpw {
    public final e7m0 a;
    public final ia00 b;
    public final psw c;

    public fm50(Context context, r35 r35Var, bfd bfdVar, kt91 kt91Var, pd71 pd71Var, jjz jjzVar, q8n q8nVar, String str, String str2, iu30 iu30Var) {
        cm50 cm50Var = new cm50(null, 1, "", "", false, "");
        t2m t2mVar = t2m.z;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(vl50.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new tl50(pd71Var, jjzVar, bfdVar, r35Var, context, str, str2, iu30Var, kt91Var)));
        this.a = sbl.B(cm50Var, t2mVar, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), bp30.b1, em50.b);
        this.b = n3o1.q(this).a(d640.d1, d640.e1);
        j2i j2iVar = fri.b;
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
