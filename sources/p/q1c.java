package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q1c {
    public final vnb0 a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public q1c(vnb0 vnb0Var, int i, int i2) {
        this.a = vnb0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1c)) {
            return false;
        }
        q1c q1cVar = (q1c) obj;
        return this.a == q1cVar.a && this.b == q1cVar.b && this.c == q1cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) ml3.c(this.b)) + ", verticalAlignment=" + ((Object) ol3.c(this.c)) + ')';
    }
}
