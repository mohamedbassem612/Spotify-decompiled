package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v5e0 implements w5e0 {
    public final k8g1 a;

    public v5e0(k8g1 k8g1Var) {
        this.a = k8g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5e0) && this.a.equals(((v5e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
