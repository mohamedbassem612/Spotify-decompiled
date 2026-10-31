package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ts81 implements kt81 {
    public final boolean a;
    public final cal b;

    public ts81(boolean z, cal calVar) {
        this.a = z;
        this.b = calVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ts81)) {
            return false;
        }
        ts81 ts81Var = (ts81) obj;
        return this.a == ts81Var.a && this.b == ts81Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
