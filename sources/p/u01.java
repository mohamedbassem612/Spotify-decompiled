package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u01 {
    public final do5 a;
    public final int b;
    public final boolean c;

    public u01(do5 do5Var, int i, boolean z) {
        this.a = do5Var;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u01)) {
            return false;
        }
        u01 u01Var = (u01) obj;
        return this.a.equals(u01Var.a) && this.b == u01Var.b && this.c == u01Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, kaa0.f(2131952358, this.a.hashCode() * 31, 31), 31);
    }
}
