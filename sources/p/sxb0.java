package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sxb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ jjh1 a;
    public final /* synthetic */ i44 b;
    public final /* synthetic */ byp c;

    public sxb0(jjh1 jjh1Var, i44 i44Var, byp bypVar) {
        this.a = jjh1Var;
        this.b = i44Var;
        this.c = bypVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jgv0 jgv0Var = (jgv0) obj;
        if (!bpo1.C(jgv0Var.a, this.a, this.b)) {
            ji0 ji0Var = jgv0Var.a;
            this.c.z(jgv0Var.b, jgv0Var.c, jgv0Var.d, ji0Var);
        }
        return rih1.a;
    }
}
