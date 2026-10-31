package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z931 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ca31 a;

    public z931(ca31 ca31Var) {
        this.a = ca31Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ca31 ca31Var = this.a;
        nt21 nt21Var = ca31Var.e;
        i8h1 i8h1Var = (i8h1) ((ykq) nt21Var.b).get();
        j4m0 j4m0Var = (j4m0) nt21Var.c;
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("mute_playback", 1, b7xVar), j4m0Var.a, r6h1.c, System.currentTimeMillis()), (xj61) null);
        zhq0 zhq0Var = ca31Var.d.f;
        if (zhq0Var != null) {
            zhq0Var.o(jgt0.a);
            return rih1.a;
        }
        u890.C("playCommandHandler");
        throw null;
    }
}
