package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class er71 {
    public final ArrayList a;

    public er71(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof er71) && this.a.equals(((er71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
