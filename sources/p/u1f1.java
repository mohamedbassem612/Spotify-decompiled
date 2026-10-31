package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u1f1 {
    public final List a;

    public u1f1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1f1) && u890.j(this.a, ((u1f1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
