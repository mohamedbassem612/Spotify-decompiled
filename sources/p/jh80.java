package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jh80 {
    public final String a;
    public final String b;

    public jh80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh80)) {
            return false;
        }
        jh80 jh80Var = (jh80) obj;
        return u890.j(this.a, jh80Var.a) && u890.j(this.b, jh80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
