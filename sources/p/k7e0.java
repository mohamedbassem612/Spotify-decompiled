package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k7e0 implements l7e0 {
    public final String a;
    public final String b;

    public k7e0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // p.l7e0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7e0)) {
            return false;
        }
        k7e0 k7e0Var = (k7e0) obj;
        return u890.j(this.a, k7e0Var.a) && u890.j(this.b, k7e0Var.b);
    }

    @Override // p.l7e0
    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
