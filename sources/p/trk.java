package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class trk {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public trk(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trk)) {
            return false;
        }
        trk trkVar = (trk) obj;
        return this.a.equals(trkVar.a) && this.b.equals(trkVar.b) && this.c.equals(trkVar.c) && u890.j(this.d, trkVar.d) && this.e.equals(trkVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
