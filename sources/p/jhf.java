package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jhf extends jto1 {
    public final String b;
    public final String c;

    public jhf(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhf)) {
            return false;
        }
        jhf jhfVar = (jhf) obj;
        return u890.j(this.b, jhfVar.b) && u890.j(this.c, jhfVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
