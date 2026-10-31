package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class btc0 extends htc0 {
    public final int a;
    public final b8e0 b;

    public btc0(int i, b8e0 b8e0Var) {
        this.a = i;
        this.b = b8e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btc0)) {
            return false;
        }
        btc0 btc0Var = (btc0) obj;
        return this.a == btc0Var.a && u890.j(this.b, btc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
