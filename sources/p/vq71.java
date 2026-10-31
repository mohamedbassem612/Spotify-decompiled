package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vq71 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final ual1 e;
    public final Integer f;
    public final sju g;

    public /* synthetic */ vq71(String str, String str2, boolean z, String str3, Integer num, sju sjuVar, int i) {
        this(str, str2, z, (i & 8) != 0 ? null : str3, sal1.a, (i & 32) != 0 ? 5 : num, sjuVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq71)) {
            return false;
        }
        vq71 vq71Var = (vq71) obj;
        return u890.j(this.a, vq71Var.a) && u890.j(this.b, vq71Var.b) && this.c == vq71Var.c && u890.j(this.d, vq71Var.d) && u890.j(this.e, vq71Var.e) && u890.j(this.f, vq71Var.f) && u890.j(this.g, vq71Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iG = xcg1.g(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int iHashCode = (this.e.hashCode() + ((iG + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Integer num = this.f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        sju sjuVar = this.g;
        return iHashCode2 + (sjuVar != null ? sjuVar.hashCode() : 0);
    }

    public vq71(String str, String str2, boolean z, String str3, ual1 ual1Var, Integer num, sju sjuVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = ual1Var;
        this.f = num;
        this.g = sjuVar;
    }
}
