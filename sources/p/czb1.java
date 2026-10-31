package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class czb1 implements dzb1 {
    public final Flowable a;

    public czb1(Flowable flowable) {
        this.a = flowable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czb1) && u890.j(this.a, ((czb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
