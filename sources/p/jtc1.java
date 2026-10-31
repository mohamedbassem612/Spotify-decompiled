package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jtc1 {
    public final String a;
    public final int b;

    public jtc1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtc1)) {
            return false;
        }
        jtc1 jtc1Var = (jtc1) obj;
        return this.a.equals(jtc1Var.a) && this.b == jtc1Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        return iHashCode + (i == 0 ? 0 : l1d.C(i));
    }
}
