package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ewu implements hwu {
    public final Set a;
    public final boolean b;

    public ewu(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewu)) {
            return false;
        }
        ewu ewuVar = (ewu) obj;
        return u890.j(this.a, ewuVar.a) && this.b == ewuVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
