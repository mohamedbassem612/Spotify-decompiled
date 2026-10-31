package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m4c1 {
    public final List a;

    public m4c1(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4c1) && u890.j(this.a, ((m4c1) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.a.hashCode() * 31);
    }
}
