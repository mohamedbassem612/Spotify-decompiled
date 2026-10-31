package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nq01 {
    public final ArrayList a;

    public nq01(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nq01) && this.a.equals(((nq01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
