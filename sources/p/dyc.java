package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dyc implements z0i {
    public final ArrayList a;

    public dyc(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyc) && this.a.equals(((dyc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
