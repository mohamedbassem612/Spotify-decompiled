package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class boj1 extends coj1 {
    public final boolean a;
    public final int b;
    public final boolean c;

    public boj1(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boj1)) {
            return false;
        }
        boj1 boj1Var = (boj1) obj;
        return this.a == boj1Var.a && this.b == boj1Var.b && this.c == boj1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ab80.k(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
