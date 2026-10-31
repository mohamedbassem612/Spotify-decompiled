package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sd41 {
    public final oj3 a;
    public final w4h b;

    public sd41(oj3 oj3Var, w4h w4hVar) {
        this.a = oj3Var;
        this.b = w4hVar;
    }

    public static Completable a(sd41 sd41Var, String str, tv80 tv80Var, int i) {
        lik1 lik1Var = nik1.x1;
        if ((i & 4) != 0) {
            tv80Var = null;
        }
        oj3 oj3Var = sd41Var.a;
        List listSingletonList = Collections.singletonList(str);
        String str2 = lik1Var.a;
        return oj3Var.c(listSingletonList, str2, str2, true, new gj3(27, tv80Var)).ignoreElement();
    }

    public static Completable b(sd41 sd41Var, String str, tv80 tv80Var, int i) {
        lik1 lik1Var = nik1.x1;
        if ((i & 4) != 0) {
            tv80Var = null;
        }
        oj3 oj3Var = sd41Var.a;
        List listSingletonList = Collections.singletonList(str);
        String str2 = lik1Var.a;
        return oj3Var.c(listSingletonList, str2, str2, false, new gj3(27, tv80Var)).ignoreElement();
    }

    public final Observable c(String str) {
        List listSingletonList = Collections.singletonList(str);
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.c);
        u4hVarQ.n(listSingletonList);
        return this.b.c(u4hVarQ.build()).map(new qy40(listSingletonList, (byte) 4)).map(new clv(str, (byte) 13));
    }
}
