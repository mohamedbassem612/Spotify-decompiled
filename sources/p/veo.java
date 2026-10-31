package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class veo {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final int d;
    public final int e;

    public veo(int i, Integer num, Integer num2, int i2, int i3, int i4) {
        i = (i4 & 1) != 0 ? 0 : i;
        num = (i4 & 2) != 0 ? null : num;
        num2 = (i4 & 4) != 0 ? null : num2;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        i3 = (i4 & 16) != 0 ? 0 : i3;
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof veo)) {
            return false;
        }
        veo veoVar = (veo) obj;
        return this.a == veoVar.a && u890.j(this.b, veoVar.b) && u890.j(this.c, veoVar.c) && this.d == veoVar.d && this.e == veoVar.e;
    }

    public final int hashCode() {
        int i = this.a;
        int iC = (i == 0 ? 0 : l1d.C(i)) * 31;
        Integer num = this.b;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        int i2 = this.d;
        int iC2 = (iHashCode2 + (i2 == 0 ? 0 : l1d.C(i2))) * 31;
        int i3 = this.e;
        return iC2 + (i3 != 0 ? l1d.C(i3) : 0);
    }
}
