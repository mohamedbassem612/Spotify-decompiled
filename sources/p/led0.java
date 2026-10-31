package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class led0 {
    public final String a;
    public final String b;

    public led0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof led0)) {
            return false;
        }
        led0 led0Var = (led0) obj;
        return u890.j(this.a, led0Var.a) && u890.j(this.b, led0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
