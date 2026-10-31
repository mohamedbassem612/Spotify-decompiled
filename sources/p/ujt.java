package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ujt implements dkt {
    public final String a;
    public final String b;
    public final String c;

    public ujt(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujt)) {
            return false;
        }
        ujt ujtVar = (ujt) obj;
        return this.a.equals(ujtVar.a) && this.b.equals(ujtVar.b) && u890.j(this.c, ujtVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
