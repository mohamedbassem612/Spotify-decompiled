package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hl51 {
    public final ArrayList a;

    public hl51(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl51) && this.a.equals(((hl51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
