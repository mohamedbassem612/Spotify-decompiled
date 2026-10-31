package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y7v0 extends b8v0 {
    public final String a;
    public final String b;

    public y7v0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7v0)) {
            return false;
        }
        y7v0 y7v0Var = (y7v0) obj;
        return this.a.equals(y7v0Var.a) && u890.j(this.b, y7v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
