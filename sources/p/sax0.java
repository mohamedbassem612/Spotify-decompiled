package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sax0 extends yax0 {
    public final obx0 a;

    public sax0(obx0 obx0Var) {
        this.a = obx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sax0) && this.a.equals(((sax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
