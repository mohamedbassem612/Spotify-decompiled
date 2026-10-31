package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wt60 extends ru60 {
    public final String a;
    public final hso1 b;

    public wt60(String str, hso1 hso1Var) {
        this.a = str;
        this.b = hso1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt60)) {
            return false;
        }
        wt60 wt60Var = (wt60) obj;
        return u890.j(this.a, wt60Var.a) && this.b.equals(wt60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
