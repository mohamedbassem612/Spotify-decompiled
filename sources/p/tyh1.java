package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tyh1 {
    public final dzh1 a;
    public final boolean b;

    public tyh1(dzh1 dzh1Var, boolean z) {
        this.a = dzh1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyh1)) {
            return false;
        }
        tyh1 tyh1Var = (tyh1) obj;
        return u890.j(this.a, tyh1Var.a) && this.b == tyh1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
