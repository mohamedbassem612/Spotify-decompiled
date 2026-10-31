package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class p361 implements q361 {
    public final String a;
    public final String b;

    public p361(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p361)) {
            return false;
        }
        p361 p361Var = (p361) obj;
        return this.a.equals(p361Var.a) && u890.j(this.b, p361Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
