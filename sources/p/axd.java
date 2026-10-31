package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class axd implements vbd0 {
    public final ArrayList a;

    public axd(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axd) && this.a.equals(((axd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
