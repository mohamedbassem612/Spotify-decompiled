package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class soh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yoh1 a;

    public soh1(yoh1 yoh1Var) {
        this.a = yoh1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        yoh1 yoh1Var = this.a;
        Object objY = fn31.Y(yoh1Var.g, new poh1(yoh1Var, null, (byte) 0), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
