package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h2a1 implements m2a1 {
    public final List a;

    public h2a1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2a1) && this.a.equals(((h2a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
