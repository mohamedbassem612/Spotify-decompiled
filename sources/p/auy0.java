package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class auy0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ kdy0 a;

    public auy0(kdy0 kdy0Var) {
        this.a = kdy0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        kdy0 kdy0Var = this.a;
        Object objY = fn31.Y((q8n) kdy0Var.b, new pty0(kdy0Var, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
