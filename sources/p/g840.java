package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g840 implements l840 {
    public final String a;
    public final boolean b;

    public g840(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // p.l840
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g840)) {
            return false;
        }
        g840 g840Var = (g840) obj;
        return u890.j(this.a, g840Var.a) && this.b == g840Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
