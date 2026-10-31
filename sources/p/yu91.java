package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yu91 {
    public final int a;
    public final int b;
    public final boolean c;

    public yu91(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu91)) {
            return false;
        }
        yu91 yu91Var = (yu91) obj;
        return this.a == yu91Var.a && this.b == yu91Var.b && this.c == yu91Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }
}
