package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pui0 {
    public final ArrayList a;

    public pui0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pui0) && this.a.equals(((pui0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
