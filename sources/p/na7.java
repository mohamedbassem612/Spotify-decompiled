package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class na7 implements za7 {
    public final List a;

    public na7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof na7) && this.a.equals(((na7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
