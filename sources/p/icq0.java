package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class icq0 implements jcq0 {
    public final String a;
    public final ept b;

    public icq0(String str, ept eptVar) {
        this.a = str;
        this.b = eptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icq0)) {
            return false;
        }
        icq0 icq0Var = (icq0) obj;
        return u890.j(this.a, icq0Var.a) && u890.j(this.b, icq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
