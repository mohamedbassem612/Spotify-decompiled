package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k0m1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yjq a;

    public k0m1(yjq yjqVar) {
        this.a = yjqVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xzl1 xzl1Var = (xzl1) obj;
        ayh ayhVarA = sap1.a();
        yjq yjqVar = this.a;
        ((ConcurrentHashMap) yjqVar.e).put(xzl1Var.a, ayhVarA);
        fn31.T((llm) yjqVar.b, (o8n) null, 0, new l2w(yjqVar, xzl1Var, ayhVarA, (lnm) null, (byte) 11), 3);
        return rih1.a;
    }
}
