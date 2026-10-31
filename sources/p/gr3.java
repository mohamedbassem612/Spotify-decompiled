package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gr3 extends hr3 {
    public final Set a;

    public gr3(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr3) && this.a.equals(((gr3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
