package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class px50 implements qx50 {
    public final float a;
    public final List b;

    public px50(float f, List list) {
        this.a = f;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px50)) {
            return false;
        }
        px50 px50Var = (px50) obj;
        return Float.compare(this.a, px50Var.a) == 0 && this.b.equals(px50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }
}
