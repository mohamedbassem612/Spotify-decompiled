package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i1q0 implements j1q0 {
    public final String a;
    public final String b;

    public i1q0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // p.j1q0
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1q0)) {
            return false;
        }
        i1q0 i1q0Var = (i1q0) obj;
        return u890.j(this.a, i1q0Var.a) && u890.j(this.b, i1q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
