package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wtv0 implements euv0 {
    public final String a = "free";
    public final String b;
    public final djw0 c;

    public wtv0(String str, djw0 djw0Var) {
        this.b = str;
        this.c = djw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtv0)) {
            return false;
        }
        wtv0 wtv0Var = (wtv0) obj;
        return this.a.equals(wtv0Var.a) && u890.j(this.b, wtv0Var.b) && u890.j(this.c, wtv0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        djw0 djw0Var = this.c;
        return iHashCode2 + (djw0Var != null ? djw0Var.hashCode() : 0);
    }
}
