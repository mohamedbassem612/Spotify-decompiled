package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p0u extends q0u {
    public final ArrayList a;

    public p0u(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0u) && this.a.equals(((p0u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
