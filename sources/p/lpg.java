package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lpg implements ez00 {
    public final String a;
    public final String b;
    public final String c;

    public lpg(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpg)) {
            return false;
        }
        lpg lpgVar = (lpg) obj;
        return this.a.equals(lpgVar.a) && this.b.equals(lpgVar.b) && this.c.equals(lpgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
