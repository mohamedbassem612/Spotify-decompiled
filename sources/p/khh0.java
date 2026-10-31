package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class khh0 {
    public final String a;
    public final int b;

    public khh0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khh0)) {
            return false;
        }
        khh0 khh0Var = (khh0) obj;
        return u890.j(this.a, khh0Var.a) && this.b == khh0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
