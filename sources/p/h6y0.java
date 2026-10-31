package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h6y0 {
    public final UUID a;
    public final v6y0 b;
    public final boolean c;
    public final boolean d;
    public final UUID e;
    public final faa0 f;
    public final o6y0 g;

    public h6y0(UUID uuid, v6y0 v6y0Var, boolean z, boolean z2, UUID uuid2, faa0 faa0Var, o6y0 o6y0Var) {
        this.a = uuid;
        this.b = v6y0Var;
        this.c = z;
        this.d = z2;
        this.e = uuid2;
        this.f = faa0Var;
        this.g = o6y0Var;
    }

    public static h6y0 a(h6y0 h6y0Var, v6y0 v6y0Var, boolean z, UUID uuid, xab1 xab1Var, o6y0 o6y0Var, int i) {
        UUID uuid2 = h6y0Var.a;
        if ((i & 2) != 0) {
            v6y0Var = h6y0Var.b;
        }
        v6y0 v6y0Var2 = v6y0Var;
        if ((i & 4) != 0) {
            z = h6y0Var.c;
        }
        boolean z2 = z;
        boolean z3 = (i & 8) != 0 ? h6y0Var.d : true;
        if ((i & 16) != 0) {
            uuid = h6y0Var.e;
        }
        UUID uuid3 = uuid;
        if ((i & 32) != 0) {
            xab1Var = h6y0Var.f;
        }
        xab1 xab1Var2 = xab1Var;
        if ((i & 64) != 0) {
            o6y0Var = h6y0Var.g;
        }
        h6y0Var.getClass();
        return new h6y0(uuid2, v6y0Var2, z2, z3, uuid3, xab1Var2, o6y0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6y0)) {
            return false;
        }
        h6y0 h6y0Var = (h6y0) obj;
        return u890.j(this.a, h6y0Var.a) && this.b.equals(h6y0Var.b) && this.c == h6y0Var.c && this.d == h6y0Var.d && u890.j(this.e, h6y0Var.e) && u890.j(this.f, h6y0Var.f) && u890.j(this.g, h6y0Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        UUID uuid = this.e;
        int iHashCode = (iG + (uuid == null ? 0 : uuid.hashCode())) * 31;
        faa0 faa0Var = this.f;
        int iHashCode2 = (iHashCode + (faa0Var == null ? 0 : faa0Var.hashCode())) * 31;
        o6y0 o6y0Var = this.g;
        return iHashCode2 + (o6y0Var != null ? o6y0Var.hashCode() : 0);
    }
}
