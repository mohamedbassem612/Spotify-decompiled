package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p4g {
    public final List a;

    public p4g(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4g) && this.a.equals(((p4g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
