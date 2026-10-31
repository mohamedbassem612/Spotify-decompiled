package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y8x0 extends w361 {
    public final obx0 c;
    public final String d;

    public y8x0(obx0 obx0Var, String str) {
        this.c = obx0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8x0)) {
            return false;
        }
        y8x0 y8x0Var = (y8x0) obj;
        return this.c.equals(y8x0Var.c) && u890.j(this.d, y8x0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
