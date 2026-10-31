package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ng80 implements og80 {
    public final at80 a;
    public final md80 b;
    public final int c;

    public ng80(int i, md80 md80Var, at80 at80Var) {
        this.a = at80Var;
        this.b = md80Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng80)) {
            return false;
        }
        ng80 ng80Var = (ng80) obj;
        return this.a == ng80Var.a && this.b == ng80Var.b && this.c == ng80Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
