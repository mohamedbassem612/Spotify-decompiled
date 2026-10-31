package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vyz implements o700 {
    public final String a;
    public final String b;

    public vyz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyz)) {
            return false;
        }
        vyz vyzVar = (vyz) obj;
        return u890.j(this.a, vyzVar.a) && u890.j(this.b, vyzVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
