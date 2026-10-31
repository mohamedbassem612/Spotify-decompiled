package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b5w implements c5w {
    public final ArrayList a;

    public b5w(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b5w) && this.a.equals(((b5w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
