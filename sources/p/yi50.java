package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yi50 {
    public final boolean a;
    public final String b;
    public final c380 c;

    public yi50(String str, c380 c380Var, boolean z) {
        this.a = z;
        this.b = str;
        this.c = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi50)) {
            return false;
        }
        yi50 yi50Var = (yi50) obj;
        return this.a == yi50Var.a && this.b.equals(yi50Var.b) && u890.j(this.c, yi50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
