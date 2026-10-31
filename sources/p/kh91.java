package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kh91 {
    public static final kh91 b = new kh91(w7x.a);
    public final Set a;

    public kh91(Set set) {
        this.a = set;
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh91) && u890.j(this.a, ((kh91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
