package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q491 {
    public final iu30 a;
    public final int b;
    public final boolean c;

    public q491(int i, iu30 iu30Var) {
        iu30Var = (i & 1) != 0 ? er81.X : iu30Var;
        int i2 = (i & 2) != 0 ? 1 : 2;
        boolean z = (i & 4) == 0;
        this.a = iu30Var;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q491)) {
            return false;
        }
        q491 q491Var = (q491) obj;
        return this.a.equals(q491Var.a) && this.b == q491Var.b && this.c == q491Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
