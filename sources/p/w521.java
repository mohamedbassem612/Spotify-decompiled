package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w521 {
    public final int a;
    public final int b;
    public final Integer c;

    public w521(int i, int i2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w521)) {
            return false;
        }
        w521 w521Var = (w521) obj;
        return this.a == w521Var.a && this.b == w521Var.b && u890.j(this.c, w521Var.c);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return iF + (num == null ? 0 : num.hashCode());
    }
}
