package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rzj1 {
    public final String a;
    public final String b;

    public rzj1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzj1)) {
            return false;
        }
        rzj1 rzj1Var = (rzj1) obj;
        return u890.j(this.a, rzj1Var.a) && u890.j(this.b, rzj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
