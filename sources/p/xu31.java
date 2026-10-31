package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xu31 implements bw31 {
    public final ch90 a;
    public final String b;
    public final boolean c;

    public xu31(ch90 ch90Var, boolean z) {
        String str = ch90Var.a;
        this.a = ch90Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu31)) {
            return false;
        }
        xu31 xu31Var = (xu31) obj;
        return this.a.equals(xu31Var.a) && this.b.equals(xu31Var.b) && this.c == xu31Var.c;
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, false);
    }
}
