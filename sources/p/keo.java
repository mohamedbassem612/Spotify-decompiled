package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class keo {
    public final x1e a;
    public final ArrayList b;

    public keo(x1e x1eVar, ArrayList arrayList) {
        this.a = x1eVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keo)) {
            return false;
        }
        keo keoVar = (keo) obj;
        return u890.j(this.a, keoVar.a) && this.b.equals(keoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
