package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class srg1 {
    public final int a;
    public final Integer b;

    public srg1(int i, int i2) {
        Integer num = (i2 & 8) != 0 ? null : 2131959421;
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srg1)) {
            return false;
        }
        srg1 srg1Var = (srg1) obj;
        return this.a == srg1Var.a && u890.j(this.b, srg1Var.b);
    }

    public final int hashCode() {
        int iF = kaa0.f(2131959404, kaa0.f(2131959401, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.b;
        return iF + (num == null ? 0 : num.hashCode());
    }
}
