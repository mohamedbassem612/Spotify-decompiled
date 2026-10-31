package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xxj1 {
    public final Set a;

    public xxj1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxj1) && this.a.equals(((xxj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
