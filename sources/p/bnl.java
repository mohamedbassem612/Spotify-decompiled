package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bnl {
    public final ah91 a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final zg91 f;
    public final UUID g;

    public bnl(ah91 ah91Var, int i, int i2, boolean z, int i3, zg91 zg91Var, UUID uuid) {
        this.a = ah91Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
        this.f = zg91Var;
        this.g = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnl)) {
            return false;
        }
        bnl bnlVar = (bnl) obj;
        return u890.j(this.a, bnlVar.a) && this.b == bnlVar.b && this.c == bnlVar.c && this.d == bnlVar.d && this.e == bnlVar.e && this.f == bnlVar.f && u890.j(this.g, bnlVar.g);
    }

    public final int hashCode() {
        ah91 ah91Var = this.a;
        int iHashCode = (this.f.hashCode() + ab80.k(this.e, xcg1.g(kaa0.f(this.c, kaa0.f(this.b, (ah91Var == null ? 0 : ah91Var.hashCode()) * 31, 31), 31), 31, this.d), 31)) * 31;
        UUID uuid = this.g;
        return iHashCode + (uuid != null ? uuid.hashCode() : 0);
    }
}
