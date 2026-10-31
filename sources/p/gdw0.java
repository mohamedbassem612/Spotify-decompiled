package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gdw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pdw0 a;

    public gdw0(pdw0 pdw0Var) {
        this.a = pdw0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lcw0 lcw0Var = (lcw0) obj;
        pdw0 pdw0Var = this.a;
        r091 r091Var = (r091) pdw0Var.a.b;
        if (r091Var != null) {
            llm llmVar = pdw0Var.Y;
            if (llmVar != null) {
                smo1.p(llmVar, (CancellationException) null);
            }
            llm llmVarE = smo1.e(flo1.l(guo1.B(), pdw0Var.t));
            pdw0Var.Y = llmVarE;
            jr30 jr30Var = pdw0Var.f;
            String str = lcw0Var.a;
            jr30Var.getClass();
            fn31.T(llmVarE, (o8n) null, 0, new gr30(r091Var, jr30Var, str, llmVarE, (lnm) null), 3);
            String str2 = lcw0Var.a;
            pdw0Var.N0 = str2;
            p731 p731Var = pdw0Var.i;
            if (p731Var != null) {
                p731Var.e(str2, new mwv0(pdw0Var, (byte) 9));
            }
        }
        return rih1.a;
    }
}
