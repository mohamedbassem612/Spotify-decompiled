package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jld0 {
    public final boolean a;
    public final long b;

    public jld0(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jld0)) {
            return false;
        }
        jld0 jld0Var = (jld0) obj;
        return this.a == jld0Var.a && this.b == jld0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
