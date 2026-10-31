package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class efz {
    public final ArrayList a;

    public efz(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof efz) && this.a.equals(((efz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }
}
