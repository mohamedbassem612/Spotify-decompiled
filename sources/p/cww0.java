package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cww0 {
    public final String a;
    public final String b;
    public final Integer c;

    public cww0(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cww0)) {
            return false;
        }
        cww0 cww0Var = (cww0) obj;
        return this.a.equals(cww0Var.a) && u890.j(this.b, cww0Var.b) && u890.j(this.c, cww0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
