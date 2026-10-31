package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nzl1 {
    public final String a;
    public final ryl1 b;

    public nzl1(String str, ryl1 ryl1Var) {
        this.a = str;
        this.b = ryl1Var;
    }

    public final String a() {
        return this.a;
    }

    public final ryl1 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzl1)) {
            return false;
        }
        nzl1 nzl1Var = (nzl1) obj;
        return this.a.equals(nzl1Var.a) && this.b.equals(nzl1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
