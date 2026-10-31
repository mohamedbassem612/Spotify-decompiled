package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface ych1 {
    default Completable b(tv80 tv80Var) {
        return CompletableEmpty.a;
    }

    void c(hia1 hia1Var);

    void e(boolean z);

    void f(ssi0 ssi0Var);

    default void h() {
        e(false);
    }

    default void d() {
    }

    default void g() {
    }

    default void a(List list) {
    }
}
