package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dcq0 implements jcq0 {
    public final String a;
    public final ept b;

    public dcq0(String str, ept eptVar) {
        this.a = str;
        this.b = eptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcq0)) {
            return false;
        }
        dcq0 dcq0Var = (dcq0) obj;
        return u890.j(this.a, dcq0Var.a) && u890.j(this.b, dcq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
