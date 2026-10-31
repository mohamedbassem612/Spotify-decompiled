package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ohq0 implements qhq0 {
    public final String a;
    public final k9 b;

    public ohq0(String str, k9 k9Var) {
        this.a = str;
        this.b = k9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohq0)) {
            return false;
        }
        ohq0 ohq0Var = (ohq0) obj;
        return u890.j(this.a, ohq0Var.a) && this.b.equals(ohq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
