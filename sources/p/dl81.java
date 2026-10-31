package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dl81 extends kl81 {
    public final String a;
    public final el81 b;

    public dl81(String str, el81 el81Var) {
        this.a = str;
        this.b = el81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl81)) {
            return false;
        }
        dl81 dl81Var = (dl81) obj;
        return this.a.equals(dl81Var.a) && this.b == dl81Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        el81 el81Var = this.b;
        return iHashCode + (el81Var == null ? 0 : el81Var.hashCode());
    }
}
