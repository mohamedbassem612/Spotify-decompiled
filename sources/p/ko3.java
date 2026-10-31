package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ko3 implements oo3 {
    public final String a;
    public final String b;

    public ko3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko3)) {
            return false;
        }
        ko3 ko3Var = (ko3) obj;
        return u890.j(this.a, ko3Var.a) && u890.j(this.b, ko3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
