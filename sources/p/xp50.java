package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xp50 {
    public final List a;

    public xp50(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp50) && u890.j(this.a, ((xp50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
