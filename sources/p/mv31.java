package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mv31 implements nv31 {
    public final long a;
    public final float b;

    public mv31(long j, float f) {
        this.a = j;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv31)) {
            return false;
        }
        mv31 mv31Var = (mv31) obj;
        return this.a == mv31Var.a && Float.compare(this.b, mv31Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
