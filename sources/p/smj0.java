package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class smj0 {
    public final ArrayList a;

    public smj0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof smj0) && this.a.equals(((smj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
