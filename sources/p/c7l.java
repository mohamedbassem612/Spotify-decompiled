package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c7l {
    public final boolean a;
    public final boolean b;
    public final ArrayList c;
    public final boolean d;
    public final boolean e;

    public c7l(boolean z, boolean z2, ArrayList arrayList, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = arrayList;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7l)) {
            return false;
        }
        c7l c7lVar = (c7l) obj;
        return this.a == c7lVar.a && this.b == c7lVar.b && this.c.equals(c7lVar.c) && this.d == c7lVar.d && this.e == c7lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(p3d1.f(this.c, xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }
}
