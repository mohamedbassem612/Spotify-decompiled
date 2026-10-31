package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wvy implements z0i {
    public final String a;
    public final String b;
    public final String c;

    public wvy(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvy)) {
            return false;
        }
        wvy wvyVar = (wvy) obj;
        return this.a.equals(wvyVar.a) && this.b.equals(wvyVar.b) && this.c.equals(wvyVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
