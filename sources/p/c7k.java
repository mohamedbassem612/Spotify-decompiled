package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c7k {
    public final String a;
    public final List b;

    public c7k(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7k)) {
            return false;
        }
        c7k c7kVar = (c7k) obj;
        return u890.j(this.a, c7kVar.a) && u890.j(this.b, c7kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
