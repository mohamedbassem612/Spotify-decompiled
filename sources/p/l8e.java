package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l8e {
    public final String a;
    public final ArrayList b;

    public l8e(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8e)) {
            return false;
        }
        l8e l8eVar = (l8e) obj;
        return this.a.equals(l8eVar.a) && this.b.equals(l8eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
