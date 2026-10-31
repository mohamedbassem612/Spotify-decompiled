package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b921 implements xpw {
    public final e7m0 a;
    public xul0 b;
    public final ia00 c;
    public final psw d;

    public b921(kt91 kt91Var, Context context, i8h1 i8h1Var, q8n q8nVar, pte pteVar, cy7 cy7Var) {
        x821 x821Var = new x821("", "", "", "", false, false, false, (m821) null);
        t7p0 t7p0Var = t7p0.v;
        Resources resources = context.getResources();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        f821 f821Var = new f821(resources, kt91Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(p821.class), cancelPrevious.a(f821Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(o821.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new g821(cy7Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(n821.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new i821(pteVar)));
        this.a = sbl.z(x821Var, t7p0Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), rs11.P0, i021.c1);
        this.c = n3o1.q(this).a(new z821(this, (byte) 0), ok11.c1);
        j2i j2iVar = new j2i(1384431591, new t20(this, i8h1Var, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
