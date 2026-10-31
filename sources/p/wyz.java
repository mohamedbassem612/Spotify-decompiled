package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wyz implements y600 {
    public final String a;
    public final String b;

    public wyz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyz)) {
            return false;
        }
        wyz wyzVar = (wyz) obj;
        return u890.j(this.a, wyzVar.a) && u890.j(this.b, wyzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
