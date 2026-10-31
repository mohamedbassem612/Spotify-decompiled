package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kuc1 {
    public final guc1 a;
    public final kwc1 b;
    public final int c;

    public kuc1(guc1 guc1Var, kwc1 kwc1Var, int i) {
        this.a = guc1Var;
        this.b = kwc1Var;
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final guc1 b() {
        return this.a;
    }

    public final kwc1 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuc1)) {
            return false;
        }
        kuc1 kuc1Var = (kuc1) obj;
        return u890.j(this.a, kuc1Var.a) && this.b.equals(kuc1Var.b) && this.c == kuc1Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
