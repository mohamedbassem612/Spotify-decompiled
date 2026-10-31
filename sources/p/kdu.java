package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kdu {
    public final long a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Map e;

    public kdu(long j, String str, boolean z, boolean z2, Map map) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = map;
    }

    public static kdu a(kdu kduVar, String str, boolean z, boolean z2, Map map, int i) {
        long j = kduVar.a;
        if ((i & 2) != 0) {
            str = kduVar.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = kduVar.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = kduVar.d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            map = kduVar.e;
        }
        return new kdu(j, str2, z3, z4, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdu)) {
            return false;
        }
        kdu kduVar = (kdu) obj;
        return this.a == kduVar.a && u890.j(this.b, kduVar.b) && this.c == kduVar.c && this.d == kduVar.d && u890.j(this.e, kduVar.e);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.e.hashCode() + xcg1.g(xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
    }
}
