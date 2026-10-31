package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dd8 implements ez00 {
    public final ArrayList a;

    public dd8(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd8) && this.a.equals(((dd8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
