package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j3a0 implements q3a0 {
    public final re9 a;

    public j3a0(re9 re9Var) {
        this.a = re9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3a0) && this.a.equals(((j3a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
