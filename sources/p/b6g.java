package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b6g implements c6g {
    public final List a;

    public b6g(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6g) && u890.j(this.a, ((b6g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
