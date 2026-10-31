package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public interface j6p0 {
    default Flowable b() {
        return Flowable.I(Boolean.TRUE);
    }

    Flowable f();

    Flowable h();

    Flowable m();

    void n();

    void o();

    default void c(boolean z) {
    }
}
