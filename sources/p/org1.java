package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class org1 {
    public final boolean a;
    public final Integer b;
    public final Long c;
    public final boolean d;

    public org1(Integer num, Long l, boolean z, boolean z2) {
        this.a = z;
        this.b = num;
        this.c = l;
        this.d = z2;
    }

    public final boolean a() {
        return this.d;
    }

    public final Integer b() {
        return this.b;
    }

    public final Long c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof org1)) {
            return false;
        }
        org1 org1Var = (org1) obj;
        return this.a == org1Var.a && u890.j(this.b, org1Var.b) && u890.j(this.c, org1Var.c) && this.d == org1Var.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 31);
    }
}
