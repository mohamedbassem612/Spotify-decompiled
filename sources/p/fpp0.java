package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fpp0 {
    public final List a;

    public fpp0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fpp0) && this.a.equals(((fpp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
