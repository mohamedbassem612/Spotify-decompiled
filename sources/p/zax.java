package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zax {
    public final int a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final int e;
    public final int f;

    public zax(int i, Integer num, Integer num2) {
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        this.a = 6;
        this.b = 4;
        this.c = num;
        this.d = num2;
        this.e = 1;
        this.f = 1;
        if (num != null && num.intValue() <= 0) {
            hhg1.n("Width must be greater than 0");
            throw null;
        }
        if (num2 == null || num2.intValue() > 0) {
            return;
        }
        hhg1.n("Height must be greater than 0");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zax)) {
            return false;
        }
        zax zaxVar = (zax) obj;
        return this.a == zaxVar.a && this.b == zaxVar.b && u890.j(this.c, zaxVar.c) && u890.j(this.d, zaxVar.d) && this.e == zaxVar.e && this.f == zaxVar.f;
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, l1d.C(this.a) * 31, 31);
        Integer num = this.c;
        int iHashCode = (iK + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return l1d.C(this.f) + ab80.k(this.e, (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }
}
