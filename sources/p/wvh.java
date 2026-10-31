package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wvh implements yvh {
    public final String a;
    public final String b;
    public final String c;

    public wvh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvh)) {
            return false;
        }
        wvh wvhVar = (wvh) obj;
        return this.a.equals(wvhVar.a) && this.b.equals(wvhVar.b) && u890.j(this.c, wvhVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
