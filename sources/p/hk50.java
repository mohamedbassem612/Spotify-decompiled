package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hk50 implements kk50 {
    public final List a;

    public hk50(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hk50) && this.a.equals(((hk50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
