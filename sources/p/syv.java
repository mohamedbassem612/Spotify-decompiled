package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class syv extends crn1 {
    public final String b;
    public final String c;
    public final lrz0 d;

    public syv(String str, String str2, lrz0 lrz0Var) {
        this.b = str;
        this.c = str2;
        this.d = lrz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syv)) {
            return false;
        }
        syv syvVar = (syv) obj;
        return u890.j(this.b, syvVar.b) && u890.j(this.c, syvVar.c) && u890.j(this.d, syvVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
