package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fvr0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ivr0 a;

    public fvr0(ivr0 ivr0Var) {
        this.a = ivr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bvr0 bvr0Var = (bvr0) obj;
        poj0 poj0Var = this.a.a;
        String str = bvr0Var.b;
        tv80 tv80Var = bvr0Var.c;
        rmc1 rmc1Var = (rmc1) poj0Var.d;
        boolean z = rmc1Var.e instanceof xxa0;
        zzy zzyVar = z ? yzy.b : uzy.b;
        Boolean boolValueOf = null;
        if (z) {
            yq00 yq00Var = rmc1Var.g;
            if (yq00Var != null) {
                boolValueOf = Boolean.valueOf(yq00Var instanceof wq00);
            }
        } else {
            if (z) {
                eg.o();
                return null;
            }
            boolValueOf = Boolean.FALSE;
        }
        ((lls0) poj0Var.b).w(str, zzyVar, boolValueOf, tv80Var);
        return rih1.a;
    }
}
