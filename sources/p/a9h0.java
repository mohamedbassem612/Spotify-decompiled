package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a9h0 {
    public final List a;

    public a9h0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9h0) && u890.j(this.a, ((a9h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
