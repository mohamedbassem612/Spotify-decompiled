package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cfq0 implements ffq0 {
    public final List a;

    public cfq0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfq0) && this.a.equals(((cfq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
