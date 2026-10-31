package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t941 implements v941 {
    public final String a;
    public final Integer b;
    public final String c;
    public final dk3 d;

    public t941(String str, Integer num, String str2, dk3 dk3Var) {
        this.a = str;
        this.b = num;
        this.c = str2;
        this.d = dk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t941)) {
            return false;
        }
        t941 t941Var = (t941) obj;
        return u890.j(this.a, t941Var.a) && u890.j(this.b, t941Var.b) && u890.j(this.c, t941Var.c) && u890.j(this.d, t941Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
