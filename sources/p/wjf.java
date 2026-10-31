package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wjf implements ez00 {
    public final ArrayList a;

    public wjf(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjf) && this.a.equals(((wjf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
