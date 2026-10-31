package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t93 {
    public final List a;

    public t93(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t93) && this.a.equals(((t93) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
