package p;

import com.spotify.libraryimportservice.tmm.StoreTransferResultsEngagementRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k6c0 {
    public final j6c0 a;
    public final llm b;

    public k6c0(j6c0 j6c0Var, q8n q8nVar) {
        this.a = j6c0Var;
        this.b = smo1.e(q8nVar);
    }

    public final void a(String str, e8a e8aVar, int i) {
        f8a f8aVar;
        j8y j8yVar;
        a3c1 a3c1VarN = StoreTransferResultsEngagementRequest.n();
        a3c1VarN.r(str);
        switch (e8aVar.ordinal()) {
            case 0:
                f8aVar = f8a.ALL_SUCCESS;
                break;
            case 1:
                f8aVar = f8a.PARTIAL_SUCCESS;
                break;
            case 2:
                f8aVar = f8a.ALL_FAIL;
                break;
            case 3:
                f8aVar = f8a.PARTIAL;
                break;
            case 4:
                f8aVar = f8a.PARTIAL_FAIL;
                break;
            case 5:
                f8aVar = f8a.SUCCESSFUL_FAIL;
                break;
            case 6:
                f8aVar = f8a.SUCCESSFUL_PARTIAL_FAIL;
                break;
            case 7:
                f8aVar = f8a.PARTIAL_24H;
                break;
            case 8:
                f8aVar = f8a.PARTIAL_48H;
                break;
            case 9:
                f8aVar = f8a.PARTIAL_FAIL_24H;
                break;
            case 10:
                f8aVar = f8a.PARTIAL_FAIL_48H;
                break;
            default:
                eg.o();
                return;
        }
        a3c1VarN.n(f8aVar);
        int iC = l1d.C(i);
        if (iC == 0) {
            j8yVar = j8y.IMPRESSION;
        } else if (iC == 1) {
            j8yVar = j8y.INTERACTION_CTA_TAP;
        } else if (iC == 2) {
            j8yVar = j8y.INTERACTION_DISMISSAL;
        } else {
            if (iC != 3) {
                eg.o();
                return;
            }
            j8yVar = j8y.INTERACTION_SECONDARY_CTA;
        }
        a3c1VarN.q(j8yVar);
        StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest = (StoreTransferResultsEngagementRequest) a3c1VarN.build();
        storeTransferResultsEngagementRequest.getClass();
        fn31.T(this.b, (o8n) null, 0, new n0a0((Object) this, (Object) str, (Object) storeTransferResultsEngagementRequest, (lnm) null, (byte) 5), 3);
    }
}
