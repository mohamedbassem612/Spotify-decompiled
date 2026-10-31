package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bff1 implements cff1 {
    public final int a;
    public final String b;

    public bff1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bff1)) {
            return false;
        }
        bff1 bff1Var = (bff1) obj;
        return this.a == bff1Var.a && u890.j(this.b, bff1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
