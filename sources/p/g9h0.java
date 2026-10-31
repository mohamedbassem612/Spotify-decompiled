package p;

import com.spotify.libraryimportservice.tmm.StoreTransferResultsEngagementRequest;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g9h0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l9h0 a;

    public g9h0(l9h0 l9h0Var) {
        this.a = l9h0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        for (String str : ((a9h0) obj).a) {
            k6c0 k6c0Var = this.a.e;
            a3c1 a3c1VarN = StoreTransferResultsEngagementRequest.n();
            a3c1VarN.r(str);
            a3c1VarN.q(j8y.INTERACTION_REPLACE_ITEMS);
            StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest = (StoreTransferResultsEngagementRequest) a3c1VarN.build();
            storeTransferResultsEngagementRequest.getClass();
            fn31.T(k6c0Var.b, (o8n) null, 0, new n0a0((Object) k6c0Var, (Object) str, (Object) storeTransferResultsEngagementRequest, (lnm) null, (byte) 5), 3);
        }
        return rih1.a;
    }
}
