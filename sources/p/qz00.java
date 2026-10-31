package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qz00 {
    public final Object a;
    public final int b;

    public qz00(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qz00)) {
            return false;
        }
        qz00 qz00Var = (qz00) obj;
        return this.a == qz00Var.a && this.b == qz00Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
