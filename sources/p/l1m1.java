package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l1m1 implements r1m1 {
    public final String a;
    public final String b;
    public final int c;
    public final Integer d;

    public l1m1(int i, String str, Integer num, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1m1)) {
            return false;
        }
        l1m1 l1m1Var = (l1m1) obj;
        return this.a.equals(l1m1Var.a) && this.b.equals(l1m1Var.b) && this.c == l1m1Var.c && u890.j(this.d, l1m1Var.d);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        return iK + (num == null ? 0 : num.hashCode());
    }
}
