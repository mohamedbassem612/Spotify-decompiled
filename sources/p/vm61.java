package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vm61 implements an61 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final xu30 d;
    public final um61 e;

    public vm61(Integer num, Integer num2, Integer num3, xu30 xu30Var, um61 um61Var) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = xu30Var;
        this.e = um61Var;
        ero1.s(new Object[]{num, null}, w661.i);
        ero1.s(new Object[]{num2, null}, w661.t);
        ero1.s(new Object[]{num3, null}, w661.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm61)) {
            return false;
        }
        vm61 vm61Var = (vm61) obj;
        return this.a.equals(vm61Var.a) && this.b.equals(vm61Var.b) && this.c.equals(vm61Var.c) && this.d.equals(vm61Var.d) && this.e.equals(vm61Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + pze0.e(pze0.e(this.a.hashCode() * 961, 961, this.b), 961, this.c)) * 31);
    }
}
