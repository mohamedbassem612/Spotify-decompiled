package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lyr0 {
    public final String a;
    public final String b;

    public lyr0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyr0)) {
            return false;
        }
        lyr0 lyr0Var = (lyr0) obj;
        return u890.j(this.a, lyr0Var.a) && u890.j(this.b, lyr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
