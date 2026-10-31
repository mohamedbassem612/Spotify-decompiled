package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q2z0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ x2z0 a;

    public q2z0(x2z0 x2z0Var) {
        this.a = x2z0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        k2z0 k2z0Var = (k2z0) obj;
        bjx bjxVar = this.a.g;
        String str = k2z0Var.a;
        String str2 = k2z0Var.b;
        bjxVar.e = str;
        bjxVar.f = str2;
        Object objY = fn31.Y((q8n) bjxVar.b, new p2z0(bjxVar, str, null, (byte) 6), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
