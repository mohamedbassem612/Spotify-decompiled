package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pvn0 extends wvn0 {
    public final nsn0 a;

    public pvn0(nsn0 nsn0Var) {
        this.a = nsn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvn0) && this.a.equals(((pvn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return super.toString();
    }
}
