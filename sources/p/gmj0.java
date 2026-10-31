package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gmj0 {
    public final ArrayList a;

    public gmj0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gmj0) && this.a.equals(((gmj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
