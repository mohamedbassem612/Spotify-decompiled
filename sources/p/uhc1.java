package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uhc1 implements vhc1 {
    public final String a;
    public final String b;

    public uhc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // p.vhc1
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhc1)) {
            return false;
        }
        uhc1 uhc1Var = (uhc1) obj;
        return u890.j(this.a, uhc1Var.a) && u890.j(this.b, uhc1Var.b);
    }

    @Override // p.vhc1
    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
