package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mea1 {
    public final qea1 a;

    public mea1(qea1 qea1Var) {
        this.a = qea1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mea1) && this.a.equals(((mea1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
