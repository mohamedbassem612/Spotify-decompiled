package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qr1 a;

    public jq1(qr1 qr1Var) {
        this.a = qr1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        s4g0 s4g0Var = this.a.n;
        Set set = ((fp1) obj).a;
        xab1 xab1Var = s4g0Var.e;
        if (xab1Var == null || !xab1Var.isActive()) {
            s4g0Var.h = false;
            s4g0Var.e = fn31.T(s4g0Var.c, (o8n) null, 0, new m2a0(s4g0Var, set, (lnm) null, (byte) 20), 3);
        }
        return rih1.a;
    }
}
