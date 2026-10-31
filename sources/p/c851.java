package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c851 {
    public final ArrayList a;

    public c851(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c851) && this.a.equals(((c851) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
