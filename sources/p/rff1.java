package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rff1 implements uff1 {
    public final int a;
    public final String b;

    public rff1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff1)) {
            return false;
        }
        rff1 rff1Var = (rff1) obj;
        return this.a == rff1Var.a && u890.j(this.b, rff1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
