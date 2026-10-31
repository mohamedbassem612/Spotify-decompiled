package p;

import com.spotify.mdata.cosmos.proto.InvalidateCacheRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kv00 {
    public final zmj0 a;
    public final pv00 b;

    public kv00(zmj0 zmj0Var, pv00 pv00Var) {
        this.a = zmj0Var;
        this.b = pv00Var;
    }

    public final Completable a(Class cls, List list) {
        ov00 ov00VarA = this.b.a(cls);
        if (ov00VarA == null) {
            return CompletableEmpty.a;
        }
        hz00 hz00VarB = hz00.b(ov00VarA.b());
        ac90 ac90VarP = InvalidateCacheRequest.p();
        ac90VarP.n(list);
        ac90VarP.r(hz00VarB);
        return this.a.callSingle("spotify.mdata_esperanto.proto.MetadataService", "Expire", ac90VarP.build()).map(e710.P0).ignoreElement();
    }
}
