package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class za40 extends v8r {
    public final int e;
    public final LinkedHashMap f;

    public za40(int i, LinkedHashMap linkedHashMap) {
        this.e = i;
        this.f = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za40)) {
            return false;
        }
        za40 za40Var = (za40) obj;
        return this.e == za40Var.e && this.f.equals(za40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (l1d.C(this.e) * 31);
    }
}
