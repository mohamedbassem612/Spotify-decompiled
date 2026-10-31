package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r111 {
    public final List a;

    public r111(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r111) && this.a.equals(((r111) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
