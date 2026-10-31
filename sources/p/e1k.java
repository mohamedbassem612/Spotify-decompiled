package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e1k implements k1k {
    public final List a;

    public e1k(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1k) && this.a.equals(((e1k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
