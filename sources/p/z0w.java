package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z0w implements l0i {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public z0w(List list, int i) {
        list = (i & 1) != 0 ? z6x.a : list;
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        boolean z3 = (i & 8) != 0;
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0w)) {
            return false;
        }
        z0w z0wVar = (z0w) obj;
        return this.a.equals(z0wVar.a) && this.b == z0wVar.b && this.c == z0wVar.c && this.d == z0wVar.d && u890.j(this.e, z0wVar.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
