package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c4i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m4i0 a;

    public c4i0(m4i0 m4i0Var) {
        this.a = m4i0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        r091 r091Var;
        s4i0 s4i0Var = (s4i0) obj;
        jkp0 jkp0Var = this.a.b;
        long j = s4i0Var.a;
        boolean z = s4i0Var.b;
        b7i0 b7i0Var = (b7i0) jkp0Var.b;
        yjp1 yjp1Var = wjy0.a;
        if (b7i0Var.f && (r091Var = (r091) b7i0Var.d.getValue()) != null) {
            r091Var.h(j);
        }
        if (z) {
            b7i0Var.d(yjp1Var);
        }
        return rih1.a;
    }
}
