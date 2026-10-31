package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b040 extends d040 {
    public final ArrayList a;

    public b040(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b040) && this.a.equals(((b040) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
