package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jj80 implements kj80 {
    public final String a;
    public final String b;

    public jj80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jj80)) {
            return false;
        }
        jj80 jj80Var = (jj80) obj;
        return this.a.equals(jj80Var.a) && u890.j(this.b, jj80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
