package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u5k {
    public final List a;

    public u5k(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5k) && u890.j(this.a, ((u5k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
