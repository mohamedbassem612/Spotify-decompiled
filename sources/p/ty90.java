package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ty90 {
    public final int a;
    public final String b;

    public ty90(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty90)) {
            return false;
        }
        ty90 ty90Var = (ty90) obj;
        return this.a == ty90Var.a && u890.j(this.b, ty90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
