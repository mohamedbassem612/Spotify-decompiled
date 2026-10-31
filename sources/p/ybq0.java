package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ybq0 implements jcq0 {
    public final String a;
    public final ept b;

    public ybq0(String str, ept eptVar) {
        this.a = str;
        this.b = eptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybq0)) {
            return false;
        }
        ybq0 ybq0Var = (ybq0) obj;
        return u890.j(this.a, ybq0Var.a) && u890.j(this.b, ybq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
