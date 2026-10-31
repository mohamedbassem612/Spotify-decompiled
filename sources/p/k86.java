package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k86 implements m86 {
    public final String a;
    public final String b;

    public k86(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k86)) {
            return false;
        }
        k86 k86Var = (k86) obj;
        return u890.j(this.a, k86Var.a) && u890.j(this.b, k86Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
