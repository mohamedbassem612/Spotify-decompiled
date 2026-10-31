package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vhr {
    public final int a;
    public final r6p1 b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ vhr(int i, r6p1 r6p1Var, Integer num, int i2) {
        this(i, (i2 & 2) != 0 ? null : r6p1Var, num, (i2 & 8) != 0 ? null : 2131101480);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhr)) {
            return false;
        }
        vhr vhrVar = (vhr) obj;
        return this.a == vhrVar.a && u890.j(this.b, vhrVar.b) && u890.j(this.c, vhrVar.c) && u890.j(this.d, vhrVar.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        r6p1 r6p1Var = this.b;
        int iHashCode2 = (iHashCode + (r6p1Var == null ? 0 : r6p1Var.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public vhr(int i, r6p1 r6p1Var, Integer num, Integer num2) {
        this.a = i;
        this.b = r6p1Var;
        this.c = num;
        this.d = num2;
    }
}
