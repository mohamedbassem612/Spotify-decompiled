package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o051 implements p151 {
    public final String a;
    public final boolean b;

    public o051(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o051)) {
            return false;
        }
        o051 o051Var = (o051) obj;
        return this.a.equals(o051Var.a) && this.b == o051Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
