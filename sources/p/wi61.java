package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class wi61 {
    public static final vi61 Companion = new vi61();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ wi61(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi61)) {
            return false;
        }
        wi61 wi61Var = (wi61) obj;
        return this.a == wi61Var.a && this.b == wi61Var.b && this.c == wi61Var.c && this.d == wi61Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
