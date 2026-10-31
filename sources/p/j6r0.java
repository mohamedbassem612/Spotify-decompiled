package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j6r0 {
    public final Observable a;

    public j6r0(Observable observable) {
        this.a = observable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6r0) && u890.j(this.a, ((j6r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
