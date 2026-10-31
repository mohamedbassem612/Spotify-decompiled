package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fy3 {
    public final String a;
    public final String b;

    public fy3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fy3)) {
            return false;
        }
        fy3 fy3Var = (fy3) obj;
        return u890.j(this.a, fy3Var.a) && u890.j(this.b, fy3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
