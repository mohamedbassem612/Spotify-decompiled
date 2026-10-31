package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface jvd {
    default Observable c(i iVar, ArrayList arrayList) {
        return Observable.empty();
    }

    default Observable f(i iVar, ArrayList arrayList, mvd mvdVar) {
        return Observable.just(mvdVar.g(iVar));
    }

    default Observable g(List list, String str, mvd mvdVar) {
        return Observable.empty();
    }

    yrd l(mvd mvdVar);

    Observable n(String str, List list);
}
