package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sxq implements uxq {
    public final List a;

    public sxq(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxq) && this.a.equals(((sxq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
