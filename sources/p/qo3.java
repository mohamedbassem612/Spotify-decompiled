package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qo3 extends qxd0 {
    public final int d;
    public final boolean e;
    public final boolean f;

    public qo3(int i, boolean z, boolean z2) {
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo3)) {
            return false;
        }
        qo3 qo3Var = (qo3) obj;
        return this.d == qo3Var.d && this.e == qo3Var.e && this.f == qo3Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(Integer.hashCode(this.d) * 31, 31, this.e);
    }
}
