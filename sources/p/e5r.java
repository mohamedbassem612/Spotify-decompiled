package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e5r {
    public final int a;
    public final Integer b;
    public final Integer c;

    public e5r(int i, Integer num, Integer num2) {
        this.a = i;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5r)) {
            return false;
        }
        e5r e5rVar = (e5r) obj;
        return this.a == e5rVar.a && this.b.equals(e5rVar.b) && this.c.equals(e5rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + pze0.e(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
