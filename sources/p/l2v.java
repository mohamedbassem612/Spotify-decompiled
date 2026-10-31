package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l2v {
    public final String a;
    public final String b;
    public final n2v c;

    public l2v(String str, String str2, n2v n2vVar) {
        this.a = str;
        this.b = str2;
        this.c = n2vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2v)) {
            return false;
        }
        l2v l2vVar = (l2v) obj;
        return u890.j(this.a, l2vVar.a) && u890.j(this.b, l2vVar.b) && this.c == l2vVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        n2v n2vVar = this.c;
        return iHashCode2 + (n2vVar != null ? n2vVar.hashCode() : 0);
    }
}
