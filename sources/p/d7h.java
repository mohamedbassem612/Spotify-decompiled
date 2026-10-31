package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d7h {
    public final String a;
    public final List b;
    public final boolean c;

    public d7h(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7h)) {
            return false;
        }
        d7h d7hVar = (d7h) obj;
        return this.a.equals(d7hVar.a) && this.b.equals(d7hVar.b) && this.c == d7hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
