package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class lv0 {
    public static final kv0 Companion = new kv0();
    public final Integer a;
    public final String b;
    public final Long c;
    public final String d;

    public /* synthetic */ lv0(int i, Integer num, String str, Long l, String str2) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, jv0.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = str;
        this.c = l;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv0)) {
            return false;
        }
        lv0 lv0Var = (lv0) obj;
        return u890.j(this.a, lv0Var.a) && u890.j(this.b, lv0Var.b) && u890.j(this.c, lv0Var.c) && u890.j(this.d, lv0Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
