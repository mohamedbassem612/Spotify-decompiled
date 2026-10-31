package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qr1 a;

    public iq1(qr1 qr1Var) {
        this.a = qr1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kjg1 kjg1Var = this.a.m;
        String str = ((gp1) obj).a;
        kjg1Var.h.remove(str);
        fn31.T(kjg1Var.f, (o8n) null, 0, new w621(kjg1Var, str, (lnm) null, (byte) 21), 3);
        return rih1.a;
    }
}
