package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hpm {
    public final String a;
    public final List b;

    public hpm(String str, smc0 smc0Var) {
        this.a = str;
        this.b = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpm)) {
            return false;
        }
        hpm hpmVar = (hpm) obj;
        return this.a.equals(hpmVar.a) && this.b.equals(hpmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
