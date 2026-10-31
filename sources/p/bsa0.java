package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bsa0 implements lsa0 {
    public final rq2 a;
    public final String b;
    public final boolean c;

    public bsa0(rq2 rq2Var, String str, boolean z) {
        this.a = rq2Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsa0)) {
            return false;
        }
        bsa0 bsa0Var = (bsa0) obj;
        return this.a == bsa0Var.a && u890.j(this.b, bsa0Var.b) && this.c == bsa0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
