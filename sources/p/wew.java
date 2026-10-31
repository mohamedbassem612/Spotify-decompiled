package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wew implements niw {
    public final String a;
    public final String b;

    public wew(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wew)) {
            return false;
        }
        wew wewVar = (wew) obj;
        if (!u890.j(this.a, wewVar.a)) {
            return false;
        }
        String str = wewVar.b;
        nl7 nl7Var = ges0.b;
        return this.b.equals(str);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nl7 nl7Var = ges0.b;
        return Long.hashCode(10000L) + cy30.d(iHashCode, 31, this.b);
    }
}
