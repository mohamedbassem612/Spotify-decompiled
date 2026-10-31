package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tfv0 {
    public final String a;
    public final long b;
    public final int c;

    public tfv0(long j, int i, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfv0)) {
            return false;
        }
        tfv0 tfv0Var = (tfv0) obj;
        return this.a.equals(tfv0Var.a) && this.b == tfv0Var.b && this.c == tfv0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + cy30.f(this.a.hashCode() * 31, this.b, 31);
    }
}
