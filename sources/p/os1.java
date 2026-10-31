package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class os1 implements bt1 {
    public final fo1 a;

    public os1(fo1 fo1Var) {
        this.a = fo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os1) && this.a.equals(((os1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
