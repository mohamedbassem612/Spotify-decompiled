package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cc80 {
    public final String a;
    public final int b;

    public cc80(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc80)) {
            return false;
        }
        cc80 cc80Var = (cc80) obj;
        return u890.j(this.a, cc80Var.a) && this.b == cc80Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
