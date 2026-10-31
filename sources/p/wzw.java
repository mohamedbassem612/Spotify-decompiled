package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wzw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ d1x a;

    public wzw(d1x d1xVar) {
        this.a = d1xVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        wik1 wik1Var = (wik1) obj;
        long j = wik1Var.b;
        int i = (int) (4294967295L & j);
        d1x.b(this.a, 8, wik1Var.a, Collections.singletonMap("container_ratio", String.valueOf(i == 0 ? Float.NaN : ((int) (j >> 32)) / i)), (String) null, 8);
        return rih1.a;
    }
}
