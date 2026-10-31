package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x0k implements k1k {
    public final List a;

    public x0k(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0k) && this.a.equals(((x0k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
