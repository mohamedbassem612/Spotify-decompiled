package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q440 implements x440 {
    public final String a;
    public final int b;
    public final boolean c;

    public q440(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q440)) {
            return false;
        }
        q440 q440Var = (q440) obj;
        return u890.j(this.a, q440Var.a) && this.b == q440Var.b && this.c == q440Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
