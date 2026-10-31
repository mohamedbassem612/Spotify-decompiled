package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ueu0 {
    public final String a;
    public final int b;

    public ueu0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueu0)) {
            return false;
        }
        ueu0 ueu0Var = (ueu0) obj;
        return this.a.equals(ueu0Var.a) && this.b == ueu0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
