package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pre0 {
    public final ArrayList a;
    public final float b;

    public pre0(float f, ArrayList arrayList) {
        this.a = arrayList;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pre0)) {
            return false;
        }
        pre0 pre0Var = (pre0) obj;
        return this.a.equals(pre0Var.a) && Float.compare(this.b, pre0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
