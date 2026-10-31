package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f5r {
    public final int a;
    public final Integer b;
    public final Integer c;

    public f5r(int i, Integer num, Integer num2) {
        this.a = i;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5r)) {
            return false;
        }
        f5r f5rVar = (f5r) obj;
        return this.a == f5rVar.a && this.b.equals(f5rVar.b) && this.c.equals(f5rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pze0.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
