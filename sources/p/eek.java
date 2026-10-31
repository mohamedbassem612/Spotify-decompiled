package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eek implements ez00 {
    public final ArrayList a;

    public eek(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eek) && this.a.equals(((eek) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
