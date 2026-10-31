package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z581 implements b681 {
    public final ArrayList a;

    public z581(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z581) && this.a.equals(((z581) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
