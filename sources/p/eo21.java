package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eo21 implements fo21 {
    public final String a;
    public final String b;

    public eo21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo21)) {
            return false;
        }
        eo21 eo21Var = (eo21) obj;
        return u890.j(this.a, eo21Var.a) && u890.j(this.b, eo21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
