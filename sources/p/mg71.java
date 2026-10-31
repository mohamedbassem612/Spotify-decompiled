package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mg71 extends tg71 {
    public final umt a;
    public final String b;

    public mg71(umt umtVar, String str) {
        this.a = umtVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg71)) {
            return false;
        }
        mg71 mg71Var = (mg71) obj;
        return u890.j(this.a, mg71Var.a) && u890.j(this.b, mg71Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
