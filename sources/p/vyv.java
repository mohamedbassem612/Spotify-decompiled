package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vyv extends crn1 {
    public final String b;
    public final String c;

    public vyv(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vyv)) {
            return false;
        }
        vyv vyvVar = (vyv) obj;
        return u890.j(this.b, vyvVar.b) && u890.j(this.c, vyvVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
