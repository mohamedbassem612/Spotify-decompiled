package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class au {
    public final ev a;
    public final List b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public au(ev evVar, List list, int i, boolean z, boolean z2) {
        this.a = evVar;
        this.b = list;
        this.c = i;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return u890.j(this.a, auVar.a) && u890.j(this.b, auVar.b) && this.c == auVar.c && this.d == auVar.d && this.e == auVar.e;
    }

    public final int hashCode() {
        ev evVar = this.a;
        int iHashCode = (evVar == null ? 0 : evVar.hashCode()) * 31;
        List list = this.b;
        return Boolean.hashCode(this.e) + xcg1.g(kaa0.f(this.c, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31, this.d);
    }
}
