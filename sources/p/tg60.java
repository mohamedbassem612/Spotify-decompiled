package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tg60 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public tg60(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg60)) {
            return false;
        }
        tg60 tg60Var = (tg60) obj;
        return this.a == tg60Var.a && this.b == tg60Var.b && this.c == tg60Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
