package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oza {
    public final String a;
    public final String b;
    public final String c;

    public oza(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oza)) {
            return false;
        }
        oza ozaVar = (oza) obj;
        return u890.j(this.a, ozaVar.a) && this.b.equals(ozaVar.b) && u890.j(this.c, ozaVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
