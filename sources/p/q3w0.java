package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q3w0 {
    public final s3w0 a;

    public q3w0(s3w0 s3w0Var) {
        this.a = s3w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q3w0) && u890.j(this.a, ((q3w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
