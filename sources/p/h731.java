package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h731 implements m731 {
    public final Set a;

    public h731(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h731) && this.a.equals(((h731) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
