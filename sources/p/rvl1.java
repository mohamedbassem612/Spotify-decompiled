package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rvl1 {
    public final List a;

    public rvl1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvl1) && this.a.equals(((rvl1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
