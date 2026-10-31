package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mui0 {
    public final List a;

    public mui0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mui0) && this.a.equals(((mui0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
