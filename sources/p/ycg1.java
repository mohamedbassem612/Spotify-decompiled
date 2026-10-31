package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ycg1 {
    public final k8g1 a;

    public ycg1(k8g1 k8g1Var) {
        this.a = k8g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ycg1) && this.a.equals(((ycg1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
