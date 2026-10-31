package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q640 {
    public final u740 a;
    public final String b;
    public final boolean c;

    public q640(u740 u740Var, String str, boolean z) {
        this.a = u740Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q640)) {
            return false;
        }
        q640 q640Var = (q640) obj;
        return u890.j(this.a, q640Var.a) && u890.j(this.b, q640Var.b) && this.c == q640Var.c;
    }

    public final int hashCode() {
        u740 u740Var = this.a;
        int iHashCode = (u740Var == null ? 0 : u740Var.hashCode()) * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
