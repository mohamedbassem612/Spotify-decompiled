package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class is10 {
    public final int a;
    public final c380 b;

    public is10(int i, c380 c380Var) {
        this.a = i;
        this.b = c380Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is10)) {
            return false;
        }
        is10 is10Var = (is10) obj;
        return this.a == is10Var.a && u890.j(this.b, is10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
