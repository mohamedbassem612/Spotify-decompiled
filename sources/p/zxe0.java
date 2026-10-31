package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zxe0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ aye0 a;

    public zxe0(aye0 aye0Var) {
        this.a = aye0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        yxe0 yxe0Var = (yxe0) obj;
        j2e0 j2e0Var = this.a.a;
        Object objY = fn31.Y((q8n) j2e0Var.c, new sr1(j2e0Var, yxe0Var.a, yxe0Var.b, yxe0Var.c, (lnm) null, (byte) 28), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
