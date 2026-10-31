package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bu60 extends ru60 {
    public final String a;
    public final int b;

    public bu60(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu60)) {
            return false;
        }
        bu60 bu60Var = (bu60) obj;
        return u890.j(this.a, bu60Var.a) && this.b == bu60Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
