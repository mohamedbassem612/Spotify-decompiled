package p;

import io.reactivex.rxjava3.core.Single;
import java.util.List;
import spotify.mdata.proto.Mdata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class etf1 {
    public final zmj0 a;
    public final lv00 b;

    public etf1(zmj0 zmj0Var, lv00 lv00Var) {
        this.a = zmj0Var;
        this.b = lv00Var;
    }

    public final Single a(List list) {
        rdh0 rdh0VarO = Mdata.LocalBatchedEntityRequest.o();
        sdh0 sdh0VarP = Mdata.LocalExtensionQuery.p();
        sdh0VarP.r(hz00.ORIGINAL_VIDEO);
        sdh0VarP.n(list);
        rdh0VarO.q(sdh0VarP.build());
        return this.a.a(rdh0VarO.build()).map(new dtf1(this));
    }
}
