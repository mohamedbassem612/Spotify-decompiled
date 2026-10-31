package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mn implements nn {
    public final ArrayList a;

    public mn(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn) && this.a.equals(((mn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
