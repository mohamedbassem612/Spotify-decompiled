package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class apn implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dpn a;

    public apn(dpn dpnVar) {
        this.a = dpnVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dpn dpnVar = this.a;
        c9p c9pVar = dpnVar.c;
        cir0 cir0Var = dpnVar.d;
        kp5 kp5Var = (kp5) c9pVar.a.c;
        Activity activity = (Activity) ((xon) kp5Var.a).a.get();
        c8o.l(activity);
        xon xonVar = (xon) kp5Var.a;
        lzn0 lzn0Var = (lzn0) xonVar.b.get();
        c8o.l(lzn0Var);
        rgy rgyVarS = kp5Var.s();
        a1r0 a1r0Var = (a1r0) xonVar.h.get();
        c8o.l(a1r0Var);
        dqn dqnVar = (dqn) kp5Var.b;
        q8n q8nVar = (q8n) xonVar.l.get();
        c8o.l(q8nVar);
        ljg ljgVar = (ljg) xonVar.p.get();
        c8o.l(ljgVar);
        Object objS = smo1.s(new l4f0(new p1f0(activity, lzn0Var, rgyVarS, a1r0Var, dqnVar, q8nVar, ljgVar, cir0Var), (iew) obj, (lnm) null, (byte) 23), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? objS : rih1Var;
    }
}
