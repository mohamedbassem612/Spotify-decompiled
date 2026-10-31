package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d4i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m4i0 a;

    public d4i0(m4i0 m4i0Var) {
        this.a = m4i0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u4i0 u4i0Var = (u4i0) obj;
        jkp0 jkp0Var = this.a.b;
        long j = u4i0Var.a;
        long j2 = u4i0Var.b;
        boolean z = u4i0Var.c;
        b7i0 b7i0Var = (b7i0) jkp0Var.b;
        yjp1 yjp1Var = wjy0.a;
        if (b7i0Var.h.length() != 0) {
            lsm0 lsm0VarB = b7i0Var.b(j, j2);
            r091 r091Var = (r091) b7i0Var.d.getValue();
            if (r091Var != null) {
                r091Var.b(lsm0VarB);
                b7i0Var.f = true;
                if (z) {
                    b7i0Var.d(yjp1Var);
                }
            }
        }
        return rih1.a;
    }
}
