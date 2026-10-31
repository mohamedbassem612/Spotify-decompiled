package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bi2 extends jm5 {
    public final int d;
    public final int e;
    public final int f;

    public bi2(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi2)) {
            return false;
        }
        bi2 bi2Var = (bi2) obj;
        return this.d == bi2Var.d && this.e == bi2Var.e && this.f == bi2Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + kaa0.f(this.e, Integer.hashCode(this.d) * 31, 31);
    }
}
