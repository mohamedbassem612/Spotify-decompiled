package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class sv0 {
    public static final rv0 Companion = new rv0();
    public final Integer a;
    public final Integer b;
    public final String c;
    public final String d;

    public /* synthetic */ sv0(int i, Integer num, Integer num2, String str, String str2) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, qv0.a.getDescriptor());
            throw null;
        }
        this.a = num;
        this.b = num2;
        this.c = str;
        this.d = str2;
    }

    public final String a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv0)) {
            return false;
        }
        sv0 sv0Var = (sv0) obj;
        return u890.j(this.a, sv0Var.a) && u890.j(this.b, sv0Var.b) && u890.j(this.c, sv0Var.c) && u890.j(this.d, sv0Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
