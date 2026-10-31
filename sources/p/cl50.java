package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cl50 implements dl50 {
    public final List a;

    public cl50(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl50) && this.a.equals(((cl50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
