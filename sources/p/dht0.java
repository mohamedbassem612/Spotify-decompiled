package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dht0 {
    public final String a;
    public final int b;

    public dht0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dht0)) {
            return false;
        }
        dht0 dht0Var = (dht0) obj;
        return u890.j(this.a, dht0Var.a) && this.b == dht0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
