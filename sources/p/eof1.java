package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eof1 {
    public final String a;
    public final String b;

    public eof1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eof1)) {
            return false;
        }
        eof1 eof1Var = (eof1) obj;
        return u890.j(this.a, eof1Var.a) && u890.j(this.b, eof1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
