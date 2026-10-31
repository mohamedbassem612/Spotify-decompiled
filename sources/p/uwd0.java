package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uwd0 implements rxd0 {
    public final String a;
    public final wzd0 b;

    public uwd0(String str, wzd0 wzd0Var) {
        this.a = str;
        this.b = wzd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwd0)) {
            return false;
        }
        uwd0 uwd0Var = (uwd0) obj;
        return this.a.equals(uwd0Var.a) && this.b.equals(uwd0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
