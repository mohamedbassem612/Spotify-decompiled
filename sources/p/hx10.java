package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hx10 {
    public final ArrayList a;

    public hx10(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hx10) && this.a.equals(((hx10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
