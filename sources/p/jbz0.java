package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jbz0 {
    public final String a;
    public final Integer b;
    public final boolean c;

    public jbz0(Integer num, String str, boolean z) {
        this.a = str;
        this.b = num;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbz0)) {
            return false;
        }
        jbz0 jbz0Var = (jbz0) obj;
        return u890.j(this.a, jbz0Var.a) && u890.j(this.b, jbz0Var.b) && this.c == jbz0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public /* synthetic */ jbz0(String str) {
        this(null, str, true);
    }
}
