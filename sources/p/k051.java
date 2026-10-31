package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k051 extends l051 {
    public final String a;
    public final String b;

    public k051(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // p.l051
    public final String a() {
        return this.a;
    }

    @Override // p.l051
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k051)) {
            return false;
        }
        k051 k051Var = (k051) obj;
        return this.a.equals(k051Var.a) && this.b.equals(k051Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
