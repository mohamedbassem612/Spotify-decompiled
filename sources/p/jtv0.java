package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jtv0 {
    public final String a;
    public final int b;
    public final Integer c;

    public jtv0(int i, Integer num, String str) {
        this.a = str;
        this.b = i;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtv0)) {
            return false;
        }
        jtv0 jtv0Var = (jtv0) obj;
        return u890.j(this.a, jtv0Var.a) && this.b == jtv0Var.b && u890.j(this.c, jtv0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iK = ab80.k(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Integer num = this.c;
        return iK + (num != null ? num.hashCode() : 0);
    }
}
