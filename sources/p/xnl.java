package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xnl extends aol {
    public final List a;

    public xnl(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xnl) && u890.j(this.a, ((xnl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
