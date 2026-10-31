package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m5w implements o5w {
    public final List a;

    public m5w(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5w) && this.a.equals(((m5w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
