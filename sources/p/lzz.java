package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lzz implements y600 {
    public final String a;
    public final Exception b;
    public final String c;

    public lzz(Exception exc, String str, String str2) {
        this.a = str;
        this.b = exc;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzz)) {
            return false;
        }
        lzz lzzVar = (lzz) obj;
        return u890.j(this.a, lzzVar.a) && this.b.equals(lzzVar.b) && u890.j(this.c, lzzVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
