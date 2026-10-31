package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cj91 {
    public final r961 a;
    public final ObservableRefCount b;

    public cj91(r961 r961Var, ObservableRefCount observableRefCount) {
        this.a = r961Var;
        this.b = observableRefCount;
    }

    public final Observable a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj91)) {
            return false;
        }
        cj91 cj91Var = (cj91) obj;
        return this.a == cj91Var.a && this.b == cj91Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
