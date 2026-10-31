package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ojo {
    public final kio a;
    public final int b;
    public final List c;

    public ojo(kio kioVar, int i, List list) {
        this.a = kioVar;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojo)) {
            return false;
        }
        ojo ojoVar = (ojo) obj;
        return this.a.equals(ojoVar.a) && this.b == ojoVar.b && u890.j(this.c, ojoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
