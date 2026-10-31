package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ss21 extends swf0 {
    public final rs21 a;

    public ss21(rs21 rs21Var) {
        this.a = rs21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss21) && this.a.equals(((ss21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
