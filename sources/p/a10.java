package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a10 {
    public final String a;
    public final String b;

    public a10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a10)) {
            return false;
        }
        a10 a10Var = (a10) obj;
        return this.a.equals(a10Var.a) && this.b.equals(a10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
