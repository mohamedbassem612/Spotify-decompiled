package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wof extends kuo1 {
    public final String b;
    public final String c;

    public wof(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wof)) {
            return false;
        }
        wof wofVar = (wof) obj;
        return this.b.equals(wofVar.b) && u890.j(this.c, wofVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
