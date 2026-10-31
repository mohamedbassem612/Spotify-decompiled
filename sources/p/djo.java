package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public interface djo extends jl51 {
    Single f(List list, tv80 tv80Var);

    default List j(List list) {
        return Collections.singletonList(gn90.a);
    }

    default Set k() {
        return f46.S0(new pud[]{pud.MOST_PLAYED_SONGS, pud.SOCIAL_RECOMMENDATIONS});
    }

    int l();

    Single m(List list);

    default List n(List list) {
        return list;
    }

    default boolean o() {
        return false;
    }
}
