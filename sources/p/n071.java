package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n071 implements x071 {
    public final List a;

    public n071(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n071) && u890.j(this.a, ((n071) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
