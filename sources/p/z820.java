package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z820 {
    public final ArrayList a;

    public z820(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z820) && this.a.equals(((z820) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
