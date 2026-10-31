package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ab40 extends v8r {
    public final String e;
    public final LinkedHashMap f;

    public ab40(String str, LinkedHashMap linkedHashMap) {
        this.e = str;
        this.f = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab40)) {
            return false;
        }
        ab40 ab40Var = (ab40) obj;
        return this.e.equals(ab40Var.e) && this.f.equals(ab40Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() * 31);
    }
}
