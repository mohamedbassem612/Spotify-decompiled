package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kmv0 {
    public final osm1 a;
    public final osm1 b;
    public final osm1 c;
    public final osm1 d;

    public /* synthetic */ kmv0(osm1 osm1Var, osm1 osm1Var2, osm1 osm1Var3, int i) {
        this((i & 1) != 0 ? null : osm1Var, (i & 2) != 0 ? null : osm1Var2, (i & 4) != 0 ? null : osm1Var3, (osm1) null);
    }

    public static kmv0 a(kmv0 kmv0Var, int i) {
        osm1 osm1Var = kmv0Var.a;
        osm1 osm1Var2 = kmv0Var.b;
        int i2 = i & 4;
        osm1 osm1Var3 = osm1.d;
        osm1 osm1Var4 = i2 != 0 ? kmv0Var.c : osm1Var3;
        if ((i & 8) != 0) {
            osm1Var3 = kmv0Var.d;
        }
        kmv0Var.getClass();
        return new kmv0(osm1Var, osm1Var2, osm1Var4, osm1Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmv0)) {
            return false;
        }
        kmv0 kmv0Var = (kmv0) obj;
        return this.a == kmv0Var.a && this.b == kmv0Var.b && this.c == kmv0Var.c && this.d == kmv0Var.d;
    }

    public final int hashCode() {
        osm1 osm1Var = this.a;
        int iHashCode = (osm1Var == null ? 0 : osm1Var.hashCode()) * 31;
        osm1 osm1Var2 = this.b;
        int iHashCode2 = (iHashCode + (osm1Var2 == null ? 0 : osm1Var2.hashCode())) * 31;
        osm1 osm1Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (osm1Var3 == null ? 0 : osm1Var3.hashCode())) * 31;
        osm1 osm1Var4 = this.d;
        return iHashCode3 + (osm1Var4 != null ? osm1Var4.hashCode() : 0);
    }

    public kmv0(osm1 osm1Var, osm1 osm1Var2, osm1 osm1Var3, osm1 osm1Var4) {
        this.a = osm1Var;
        this.b = osm1Var2;
        this.c = osm1Var3;
        this.d = osm1Var4;
    }
}
