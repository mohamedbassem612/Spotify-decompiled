package p;

import com.spotify.userhighlight.v1.RecommendUserHighlightRangeRequest;
import com.spotify.userhighlight.v1.RecommendUserHighlightRangeResponse;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wai1 {
    public final uai1 a;

    public wai1(uai1 uai1Var) {
        this.a = uai1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(mw01 mw01Var, onm onmVar) {
        vai1 vai1Var;
        if (onmVar instanceof vai1) {
            vai1Var = (vai1) onmVar;
            int i = vai1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vai1Var.c = i - Integer.MIN_VALUE;
            } else {
                vai1Var = new vai1(this, onmVar);
            }
        } else {
            vai1Var = new vai1(this, onmVar);
        }
        Object objA = vai1Var.a;
        int i2 = vai1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                uai1 uai1Var = this.a;
                lw01 lw01VarN = RecommendUserHighlightRangeRequest.n();
                lw01VarN.q(mw01Var.a);
                lw01VarN.n(obg1.v(mw01Var.b));
                RecommendUserHighlightRangeRequest recommendUserHighlightRangeRequest = (RecommendUserHighlightRangeRequest) lw01VarN.build();
                vai1Var.c = 1;
                objA = uai1Var.a(recommendUserHighlightRangeRequest, vai1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            RecommendUserHighlightRangeResponse recommendUserHighlightRangeResponse = (RecommendUserHighlightRangeResponse) objA;
            Long lU = obg1.u(recommendUserHighlightRangeResponse.o());
            Long lU2 = obg1.u(recommendUserHighlightRangeResponse.n());
            if (lU != null && lU2 != null) {
                return new nw01(lU.longValue(), lU2.longValue(), recommendUserHighlightRangeResponse.getUri());
            }
            return new m231(new IllegalArgumentException("Invalid range recommendation duration"));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new m231(e2);
        }
    }
}
