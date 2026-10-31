package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uyz implements y600 {
    public final String a;
    public final String b;

    public uyz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyz)) {
            return false;
        }
        uyz uyzVar = (uyz) obj;
        return u890.j(this.a, uyzVar.a) && u890.j(this.b, uyzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
