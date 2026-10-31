package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x4k0 {
    public final ArrayList a;

    public x4k0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4k0) && this.a.equals(((x4k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
