package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w3t0 implements z0i {
    public final ArrayList a;

    public w3t0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3t0) && this.a.equals(((w3t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
