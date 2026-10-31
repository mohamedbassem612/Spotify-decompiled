package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ryz implements t600 {
    public final String a;
    public final String b;

    public ryz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryz)) {
            return false;
        }
        ryz ryzVar = (ryz) obj;
        return this.a.equals(ryzVar.a) && u890.j(this.b, ryzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
