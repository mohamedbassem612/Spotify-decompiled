package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i5a0 implements k5a0 {
    public final String a;
    public final c9 b;
    public final String c;

    public i5a0(String str, c9 c9Var, String str2) {
        this.a = str;
        this.b = c9Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5a0)) {
            return false;
        }
        i5a0 i5a0Var = (i5a0) obj;
        return u890.j(this.a, i5a0Var.a) && u890.j(this.b, i5a0Var.b) && u890.j(this.c, i5a0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
