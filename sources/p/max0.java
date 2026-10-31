package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class max0 extends yax0 {
    public final obx0 a;

    public max0(obx0 obx0Var) {
        this.a = obx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof max0) && this.a.equals(((max0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
