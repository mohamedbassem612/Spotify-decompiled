package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dr6 {
    public final List a;

    public dr6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr6) && this.a.equals(((dr6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
