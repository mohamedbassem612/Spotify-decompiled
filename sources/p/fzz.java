package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fzz implements u600 {
    public final List a;

    public fzz(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzz) && this.a.equals(((fzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
