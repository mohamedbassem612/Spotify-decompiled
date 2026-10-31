package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ayr0 {
    public final String a;
    public final int b;

    public ayr0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayr0)) {
            return false;
        }
        ayr0 ayr0Var = (ayr0) obj;
        return this.a.equals(ayr0Var.a) && this.b == ayr0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
