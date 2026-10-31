package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sxm {
    public final String a;
    public final String b;
    public final rwm c;
    public final Integer d;

    public sxm(String str, String str2, rwm rwmVar, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = rwmVar;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxm)) {
            return false;
        }
        sxm sxmVar = (sxm) obj;
        return u890.j(this.a, sxmVar.a) && u890.j(this.b, sxmVar.b) && this.c == sxmVar.c && u890.j(this.d, sxmVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        rwm rwmVar = this.c;
        int iHashCode3 = (iHashCode2 + (rwmVar == null ? 0 : rwmVar.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }
}
