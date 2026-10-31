package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f6g0 extends n6g0 {
    public final i7g0 a;

    public f6g0(i7g0 i7g0Var) {
        this.a = i7g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6g0) && this.a == ((f6g0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
