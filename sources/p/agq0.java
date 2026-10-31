package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class agq0 {
    public final String a;
    public final ept b;

    public agq0(String str, ept eptVar) {
        this.a = str;
        this.b = eptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agq0)) {
            return false;
        }
        agq0 agq0Var = (agq0) obj;
        return u890.j(this.a, agq0Var.a) && u890.j(this.b, agq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
