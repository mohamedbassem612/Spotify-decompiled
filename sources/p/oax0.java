package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oax0 extends yax0 {
    public final obx0 a;

    public oax0(obx0 obx0Var) {
        this.a = obx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oax0) && this.a.equals(((oax0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
