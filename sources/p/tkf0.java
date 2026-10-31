package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tkf0 implements ukf0 {
    public final a9h a;
    public final int b;
    public final boolean c;

    public tkf0(a9h a9hVar, int i, boolean z) {
        this.a = a9hVar;
        this.b = i;
        this.c = z;
    }

    public final a9h a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkf0)) {
            return false;
        }
        tkf0 tkf0Var = (tkf0) obj;
        return this.a.equals(tkf0Var.a) && this.b == tkf0Var.b && this.c == tkf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
