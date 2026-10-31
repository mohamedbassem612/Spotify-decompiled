package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j4k1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ezb1 a;

    public j4k1(ezb1 ezb1Var) {
        this.a = ezb1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objA;
        a5k1 a5k1Var = (a5k1) obj;
        u771 u771Var = a5k1Var.a;
        boolean z = u771Var.b.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (!z || (objA = ((oud) this.a.b).a(new hud(new on71(new m3i0(new u3i0(u771Var.a.a.a, new p3i0(new r3i0(new vve1(a5k1Var.b), (xve1) null)), null, null, "video_timestamp_result_key", 8), 2131963402), new rn71(rc11.a.b(x7i0.class)))), onmVar)) != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? objA : rih1Var;
    }
}
