package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iq61 implements kq61 {
    public final int a;
    public final String b;
    public final vu30 c;
    public final xu30 d;

    public iq61(int i, String str, vu30 vu30Var, xu30 xu30Var) {
        this.a = i;
        this.b = str;
        this.c = vu30Var;
        this.d = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq61)) {
            return false;
        }
        iq61 iq61Var = (iq61) obj;
        return this.a == iq61Var.a && this.b.equals(iq61Var.b) && this.c.equals(iq61Var.c) && this.d.equals(iq61Var.d);
    }

    public final int g() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + hrt.g(xcg1.g(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, false), 31, this.c);
    }
}
