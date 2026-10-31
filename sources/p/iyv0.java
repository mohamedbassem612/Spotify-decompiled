package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iyv0 {
    public final String a;
    public final int b;
    public final n5f0 c;

    public iyv0(String str, int i, n5f0 n5f0Var) {
        this.a = str;
        this.b = i;
        this.c = n5f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyv0)) {
            return false;
        }
        iyv0 iyv0Var = (iyv0) obj;
        return this.a.equals(iyv0Var.a) && this.b == iyv0Var.b && this.c.equals(iyv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
