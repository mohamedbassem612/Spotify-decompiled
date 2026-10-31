package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m13 {
    public final List a;

    public m13(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m13) && this.a.equals(((m13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
