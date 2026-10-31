package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wr21 {
    public final String a;
    public final String b;

    public wr21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr21)) {
            return false;
        }
        wr21 wr21Var = (wr21) obj;
        return u890.j(this.a, wr21Var.a) && u890.j(this.b, wr21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
