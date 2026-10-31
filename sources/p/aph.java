package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aph implements iph {
    public final Set a;

    public aph(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aph) && this.a.equals(((aph) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
