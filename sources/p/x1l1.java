package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x1l1 extends j2l1 {
    public final String a;
    public final String b;
    public final Integer c;

    public x1l1(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1l1)) {
            return false;
        }
        x1l1 x1l1Var = (x1l1) obj;
        return u890.j(this.a, x1l1Var.a) && u890.j(this.b, x1l1Var.b) && u890.j(this.c, x1l1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }

    public /* synthetic */ x1l1(String str) {
        this(str, "network", null);
    }
}
