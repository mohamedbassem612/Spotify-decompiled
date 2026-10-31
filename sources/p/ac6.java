package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ac6 {
    public final ArrayList a;

    public ac6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ac6) && this.a.equals(((ac6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
