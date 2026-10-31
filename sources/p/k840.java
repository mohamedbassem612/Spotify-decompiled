package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k840 implements l840 {
    public final String a;
    public final boolean b;

    public k840(String str, boolean z) {
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
        if (!(obj instanceof k840)) {
            return false;
        }
        k840 k840Var = (k840) obj;
        return u890.j(this.a, k840Var.a) && this.b == k840Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
