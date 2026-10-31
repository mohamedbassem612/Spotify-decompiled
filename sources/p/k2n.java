package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k2n implements m2n {
    public final List a;

    public k2n(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2n) && this.a.equals(((k2n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
