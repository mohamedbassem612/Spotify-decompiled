package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gb6 {
    public final String a;
    public final String b;

    public gb6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb6)) {
            return false;
        }
        gb6 gb6Var = (gb6) obj;
        return this.a.equals(gb6Var.a) && this.b.equals(gb6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
