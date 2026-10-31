package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mqe implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rqe a;

    public mqe(rqe rqeVar) {
        this.a = rqeVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String strH;
        rqe rqeVar = this.a;
        fq2 fq2Var = rqeVar.a;
        Object value = rqeVar.b.C.a.getValue();
        lnm lnmVar = null;
        k680 k680Var = value instanceof k680 ? (k680) value : null;
        if (k680Var == null || (strH = k680Var.b) == null) {
            strH = fq2Var.h();
        }
        String str = strH;
        boolean z = k680Var != null ? k680Var.d : false;
        fq2Var.s();
        fq2Var.b();
        byte b = 3;
        if (str != null) {
            fq2 fq2Var2 = fq2Var;
            fn31.T(fq2Var2.q, (o8n) null, 0, new pp2(fq2Var2, str, z, null, (byte) 1), 3);
        }
        fq2Var.J();
        Object objY = fn31.Y(rqeVar.N0, new qqe(rqeVar, lnmVar, b), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
