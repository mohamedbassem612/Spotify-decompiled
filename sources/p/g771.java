package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g771 {
    public final String a;
    public final String b;

    public g771(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g771)) {
            return false;
        }
        g771 g771Var = (g771) obj;
        return u890.j(this.a, g771Var.a) && u890.j(this.b, g771Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
