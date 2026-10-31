package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ahb0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final Map d;
    public final boolean e;

    public ahb0(String str, String str2, boolean z, Map map, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = map;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahb0)) {
            return false;
        }
        ahb0 ahb0Var = (ahb0) obj;
        return u890.j(this.a, ahb0Var.a) && u890.j(this.b, ahb0Var.b) && this.c == ahb0Var.c && u890.j(this.d, ahb0Var.d) && this.e == ahb0Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + cy30.e(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
