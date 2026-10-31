package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qlh implements slh {
    public final c380 a;
    public final String b;
    public final int c;

    public qlh(int i, String str, c380 c380Var) {
        this.a = c380Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlh)) {
            return false;
        }
        qlh qlhVar = (qlh) obj;
        return u890.j(this.a, qlhVar.a) && u890.j(this.b, qlhVar.b) && this.c == qlhVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
