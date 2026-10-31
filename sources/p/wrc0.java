package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wrc0 {
    public final String a;
    public final trc0 b;

    public wrc0(String str, trc0 trc0Var) {
        this.a = str;
        this.b = trc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrc0)) {
            return false;
        }
        wrc0 wrc0Var = (wrc0) obj;
        return u890.j(this.a, wrc0Var.a) && u890.j(this.b, wrc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
