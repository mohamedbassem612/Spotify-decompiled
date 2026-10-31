package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x30 {
    public final ArrayList a;

    public x30(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x30) && this.a.equals(((x30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
