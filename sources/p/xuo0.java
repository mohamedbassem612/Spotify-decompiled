package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xuo0 extends zuo0 {
    public final k5a1 a;

    public xuo0(k5a1 k5a1Var) {
        this.a = k5a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuo0) && this.a.equals(((xuo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
