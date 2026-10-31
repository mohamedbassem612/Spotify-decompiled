package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b2a {
    public final Set a;
    public final idd1 b = new idd1(new a2a(this, (byte) 0));
    public final idd1 c = new idd1(new a2a(this, (byte) 1));
    public final idd1 d = new idd1(new a2a(this, (byte) 2));
    public final idd1 e = new idd1(new a2a(this, (byte) 3));

    public b2a(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2a) && this.a.equals(((b2a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
