package p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o2u0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Map d;

    public /* synthetic */ o2u0(String str, int i, Map map) {
        this(str, (i & 2) != 0, false, (i & 8) != 0 ? new HashMap() : map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2u0)) {
            return false;
        }
        o2u0 o2u0Var = (o2u0) obj;
        return u890.j(this.a, o2u0Var.a) && this.b == o2u0Var.b && this.c == o2u0Var.c && u890.j(this.d, o2u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public o2u0(String str, boolean z, boolean z2, Map map) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = map;
    }
}
