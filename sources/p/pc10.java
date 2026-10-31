package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pc10 {
    public final ArrayList a;

    public pc10(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc10) && this.a.equals(((pc10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
