package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class skg0 extends tkg0 {
    public final List a;

    public skg0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // p.tkg0
    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof skg0) && this.a.equals(((skg0) obj).a);
    }

    public final int hashCode() {
        return f4i1.b(Boolean.hashCode(true) * 31, 31, this.a);
    }
}
