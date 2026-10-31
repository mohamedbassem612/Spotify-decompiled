package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dyz implements p600 {
    public final dw30 a;
    public final ww30 b;
    public final boolean c;
    public final int d;

    public dyz(dw30 dw30Var, ww30 ww30Var, boolean z, int i) {
        this.a = dw30Var;
        this.b = ww30Var;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyz)) {
            return false;
        }
        dyz dyzVar = (dyz) obj;
        return u890.j(this.a, dyzVar.a) && this.b == dyzVar.b && this.c == dyzVar.c && this.d == dyzVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xcg1.g((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
