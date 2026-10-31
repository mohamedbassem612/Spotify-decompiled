package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aff1 implements cff1 {
    public final int a;
    public final String b;

    public aff1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aff1)) {
            return false;
        }
        aff1 aff1Var = (aff1) obj;
        return this.a == aff1Var.a && u890.j(this.b, aff1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
