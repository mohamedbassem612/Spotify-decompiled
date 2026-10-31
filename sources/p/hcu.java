package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hcu {
    public final long a;
    public final long b;
    public final gcu c;
    public final boolean d;
    public final Map e;

    public hcu(long j, long j2, gcu gcuVar, boolean z, Map map) {
        this.a = j;
        this.b = j2;
        this.c = gcuVar;
        this.d = z;
        this.e = map;
    }

    public static hcu a(hcu hcuVar, gcu gcuVar, boolean z, Map map, int i) {
        long j = hcuVar.a;
        long j2 = hcuVar.b;
        if ((i & 4) != 0) {
            gcuVar = hcuVar.c;
        }
        gcu gcuVar2 = gcuVar;
        if ((i & 8) != 0) {
            z = hcuVar.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            map = hcuVar.e;
        }
        return new hcu(j, j2, gcuVar2, z2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcu)) {
            return false;
        }
        hcu hcuVar = (hcu) obj;
        return this.a == hcuVar.a && this.b == hcuVar.b && this.c.equals(hcuVar.c) && this.d == hcuVar.d && u890.j(this.e, hcuVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + cy30.f(Long.hashCode(this.a) * 31, this.b, 31)) * 31, 31, this.d);
    }
}
