package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bq3 extends hr3 {
    public final String a;
    public final n6c0 b;

    public bq3(String str, n6c0 n6c0Var) {
        this.a = str;
        this.b = n6c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq3)) {
            return false;
        }
        bq3 bq3Var = (bq3) obj;
        return u890.j(this.a, bq3Var.a) && u890.j(this.b, bq3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
