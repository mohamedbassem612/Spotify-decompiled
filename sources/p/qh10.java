package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qh10 {
    public final HashMap a;
    public final boolean b;
    public final boolean c;

    public qh10(HashMap map, boolean z, boolean z2) {
        this.a = map;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh10)) {
            return false;
        }
        qh10 qh10Var = (qh10) obj;
        return this.a.equals(qh10Var.a) && this.b == qh10Var.b && this.c == qh10Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeOverrideMembers(members=");
        sb.append(this.a);
        sb.append(", containsInheritedStatics=");
        sb.append(this.b);
        sb.append(", containsPackagePrivate=");
        return f4i1.g(sb, this.c, ')');
    }
}
