package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class vv0 {
    public static final uv0 Companion = new uv0();
    public final Integer a;
    public final Long b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;

    public /* synthetic */ vv0(int i, Integer num, Long l, Integer num2, Integer num3, String str, String str2) {
        if (63 != (i & 63)) {
            o6p1.t(i, 63, tv0.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = l;
        this.c = num2;
        this.d = num3;
        this.e = str;
        this.f = str2;
    }

    public final Long a() {
        return this.b;
    }

    public final Integer b() {
        return this.c;
    }

    public final Integer c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0)) {
            return false;
        }
        vv0 vv0Var = (vv0) obj;
        return u890.j(this.a, vv0Var.a) && u890.j(this.b, vv0Var.b) && u890.j(this.c, vv0Var.c) && u890.j(this.d, vv0Var.d) && u890.j(this.e, vv0Var.e) && u890.j(this.f, vv0Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }
}
