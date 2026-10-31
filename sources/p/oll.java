package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oll {
    public final String a;
    public final List b;

    public oll(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oll)) {
            return false;
        }
        oll ollVar = (oll) obj;
        return this.a.equals(ollVar.a) && this.b.equals(ollVar.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
