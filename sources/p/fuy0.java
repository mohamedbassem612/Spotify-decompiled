package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fuy0 {
    public final ltn1 a;

    public fuy0(ltn1 ltn1Var) {
        this.a = ltn1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuy0) && this.a.equals(((fuy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
