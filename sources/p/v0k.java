package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v0k implements k1k {
    public final List a;

    public v0k(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0k) && this.a.equals(((v0k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
