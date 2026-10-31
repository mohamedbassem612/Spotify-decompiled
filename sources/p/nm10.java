package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nm10 extends w0h1 {
    public final LinkedHashMap d;
    public final boolean e;

    public nm10(LinkedHashMap linkedHashMap, boolean z) {
        this.d = linkedHashMap;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm10)) {
            return false;
        }
        nm10 nm10Var = (nm10) obj;
        return this.d.equals(nm10Var.d) && this.e == nm10Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
