package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lr71 implements pr71 {
    public final ArrayList a;

    public lr71(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr71) && this.a.equals(((lr71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
