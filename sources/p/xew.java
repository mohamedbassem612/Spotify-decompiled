package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xew implements niw {
    public final String a;
    public final String b;

    public xew(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xew)) {
            return false;
        }
        xew xewVar = (xew) obj;
        if (!u890.j(this.a, xewVar.a)) {
            return false;
        }
        String str = xewVar.b;
        nl7 nl7Var = jes0.b;
        return this.b.equals(str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nl7 nl7Var = jes0.b;
        return Long.hashCode(20000L) + cy30.d(iHashCode, 31, this.b);
    }
}
