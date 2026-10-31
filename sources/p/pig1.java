package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pig1 {
    public final long a;
    public final String b;

    public pig1(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pig1)) {
            return false;
        }
        pig1 pig1Var = (pig1) obj;
        return this.a == pig1Var.a && this.b.equals(pig1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }
}
