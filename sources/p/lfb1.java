package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lfb1 {
    public final String a;
    public final int b;

    public lfb1(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfb1)) {
            return false;
        }
        lfb1 lfb1Var = (lfb1) obj;
        return u890.j(this.a, lfb1Var.a) && this.b == lfb1Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
