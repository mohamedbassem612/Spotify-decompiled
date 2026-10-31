package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nrg1 {
    public final boolean a;
    public final Long b;
    public final Integer c;
    public final boolean d;

    public nrg1(Integer num, Long l, boolean z, boolean z2) {
        this.a = z;
        this.b = l;
        this.c = num;
        this.d = z2;
    }

    public final Integer a() {
        return this.c;
    }

    public final Long b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrg1)) {
            return false;
        }
        nrg1 nrg1Var = (nrg1) obj;
        return this.a == nrg1Var.a && u890.j(this.b, nrg1Var.b) && u890.j(this.c, nrg1Var.c) && this.d == nrg1Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public /* synthetic */ nrg1() {
        this(null, null, false, false);
    }
}
