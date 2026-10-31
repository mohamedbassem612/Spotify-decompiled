package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jlt {
    public final String a;
    public final String b;
    public final String c;
    public final afx d;

    public jlt(String str, String str2, String str3, afx afxVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = afxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlt)) {
            return false;
        }
        jlt jltVar = (jlt) obj;
        return this.a.equals(jltVar.a) && this.b.equals(jltVar.b) && this.c.equals(jltVar.c) && u890.j(this.d, jltVar.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        afx afxVar = this.d;
        return iD + (afxVar == null ? 0 : afxVar.hashCode());
    }
}
