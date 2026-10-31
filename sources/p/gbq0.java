package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gbq0 {
    public final int a;
    public final String b;
    public final ebq0 c;
    public final boolean d;

    public gbq0(int i, String str, ebq0 ebq0Var, boolean z) {
        this.a = i;
        this.b = str;
        this.c = ebq0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbq0)) {
            return false;
        }
        gbq0 gbq0Var = (gbq0) obj;
        return this.a == gbq0Var.a && u890.j(this.b, gbq0Var.b) && this.c.equals(gbq0Var.c) && this.d == gbq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(l1d.C(this.a) * 31, 31, this.b)) * 31);
    }
}
