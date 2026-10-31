package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tq51 {
    public final String a;
    public final n5f0 b;
    public final boolean c;

    public tq51(String str, n5f0 n5f0Var, boolean z) {
        this.a = str;
        this.b = n5f0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq51)) {
            return false;
        }
        tq51 tq51Var = (tq51) obj;
        return u890.j(this.a, tq51Var.a) && this.b.equals(tq51Var.b) && this.c == tq51Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
