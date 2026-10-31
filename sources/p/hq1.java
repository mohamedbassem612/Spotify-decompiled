package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qr1 a;

    public hq1(qr1 qr1Var) {
        this.a = qr1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lp1 lp1Var = (lp1) obj;
        kjg1 kjg1Var = this.a.m;
        String str = lp1Var.a;
        boolean z = lp1Var.b;
        kjg1Var.h.remove(str);
        fn31.T(kjg1Var.f, (o8n) null, 0, new p230(kjg1Var, str, z, (lnm) null), 3);
        return rih1.a;
    }
}
