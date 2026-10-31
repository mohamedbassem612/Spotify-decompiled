package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ikk extends jkk {
    public final dyi1 a;
    public final String b;

    public ikk(dyi1 dyi1Var, String str) {
        this.a = dyi1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikk)) {
            return false;
        }
        ikk ikkVar = (ikk) obj;
        return this.a.equals(ikkVar.a) && u890.j(this.b, ikkVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
