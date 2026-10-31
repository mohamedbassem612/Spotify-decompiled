package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q671 implements s671 {
    public final String a;
    public final String b;
    public final String c;

    public q671(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q671)) {
            return false;
        }
        q671 q671Var = (q671) obj;
        return u890.j(this.a, q671Var.a) && this.b.equals(q671Var.b) && this.c.equals(q671Var.c);
    }

    @Override // p.s671
    public final boolean getEnabled() {
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
