package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wei0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ wei0(boolean z, boolean z2, int i) {
        this(z, false, (i & 8) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wei0)) {
            return false;
        }
        wei0 wei0Var = (wei0) obj;
        return this.a == wei0Var.a && this.b == wei0Var.b && this.c == wei0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, false), 31, this.b);
    }

    public wei0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
