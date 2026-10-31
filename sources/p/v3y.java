package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v3y {
    public final c380 a;
    public final lj80 b;
    public final boolean c;
    public final bu91 d;
    public final boolean e;

    public v3y(c380 c380Var, lj80 lj80Var, boolean z, bu91 bu91Var, boolean z2) {
        this.a = c380Var;
        this.b = lj80Var;
        this.c = z;
        this.d = bu91Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3y)) {
            return false;
        }
        v3y v3yVar = (v3y) obj;
        return u890.j(this.a, v3yVar.a) && this.b.equals(v3yVar.b) && this.c == v3yVar.c && this.d.equals(v3yVar.d) && this.e == v3yVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }
}
