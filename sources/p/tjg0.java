package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tjg0 extends yjg0 {
    public final le20 a;

    public tjg0(le20 le20Var) {
        this.a = le20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tjg0) && this.a.equals(((tjg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
