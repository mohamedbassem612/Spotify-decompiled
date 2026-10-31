package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s7d1 {
    public final String a;
    public final String b;

    public s7d1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7d1)) {
            return false;
        }
        s7d1 s7d1Var = (s7d1) obj;
        return this.a.equals(s7d1Var.a) && this.b.equals(s7d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
