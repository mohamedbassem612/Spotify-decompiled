package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mg8 extends byo1 {
    public final String c;
    public final String d;

    public mg8(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg8)) {
            return false;
        }
        mg8 mg8Var = (mg8) obj;
        return u890.j(this.c, mg8Var.c) && u890.j(this.d, mg8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String u() {
        return this.c;
    }

    public final String v() {
        return this.d;
    }
}
