package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ehu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ i44 a;
    public final /* synthetic */ ao0 b;

    public ehu(i44 i44Var, ao0 ao0Var) {
        this.a = i44Var;
        this.b = ao0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dl21 dl21Var = (dl21) obj;
        if (!this.a.c()) {
            ao0.a(this.b, co0.Z, dl21Var.a, (Long) null, (String) null, (String) null, 124);
            ao0.a(this.b, dl21Var.b, dl21Var.a, (Long) null, (String) null, (String) null, 124);
        }
        return rih1.a;
    }
}
