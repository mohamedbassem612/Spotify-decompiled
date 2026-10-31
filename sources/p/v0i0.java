package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v0i0 {
    public final boolean a;
    public final String b;
    public final String c;

    public v0i0(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0i0)) {
            return false;
        }
        v0i0 v0i0Var = (v0i0) obj;
        return this.a == v0i0Var.a && this.b.equals(v0i0Var.b) && this.c.equals(v0i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
