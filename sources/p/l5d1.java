package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hp91 a;

    public l5d1(hp91 hp91Var) {
        this.a = hp91Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ((z4d1) obj).getClass();
        hp91 hp91Var = this.a;
        Object objY = fn31.Y((q8n) hp91Var.c, new vbc1(hp91Var, (lnm) null, (byte) 1), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
