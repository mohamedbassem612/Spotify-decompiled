package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ue21 {
    public final String a;
    public final boolean b;
    public final int c;
    public final int d;

    public ue21(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue21)) {
            return false;
        }
        ue21 ue21Var = (ue21) obj;
        return this.a.equals(ue21Var.a) && this.b == ue21Var.b && this.c == ue21Var.c && this.d == ue21Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + ab80.k(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
