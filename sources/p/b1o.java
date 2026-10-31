package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b1o implements c1o {
    public final List a;

    public b1o(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1o) && u890.j(this.a, ((b1o) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
