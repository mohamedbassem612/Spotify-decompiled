package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class moq0 extends toq0 {
    public final c560 a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public moq0(c560 c560Var, boolean z, boolean z2, String str) {
        this.a = c560Var;
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moq0)) {
            return false;
        }
        moq0 moq0Var = (moq0) obj;
        return this.a.equals(moq0Var.a) && this.b == moq0Var.b && this.c == moq0Var.c && this.d.equals(moq0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
