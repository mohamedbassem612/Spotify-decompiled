package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lax0 extends yax0 {
    public final obx0 a;

    public lax0(obx0 obx0Var) {
        this.a = obx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lax0) && this.a.equals(((lax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
