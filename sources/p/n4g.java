package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n4g {
    public final List a;

    public n4g(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4g) && this.a.equals(((n4g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
