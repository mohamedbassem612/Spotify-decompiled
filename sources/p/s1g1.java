package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s1g1 {
    public final String a;
    public final String b;

    public s1g1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1g1)) {
            return false;
        }
        s1g1 s1g1Var = (s1g1) obj;
        return this.a.equals(s1g1Var.a) && this.b.equals(s1g1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
