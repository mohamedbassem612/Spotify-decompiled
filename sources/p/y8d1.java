package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y8d1 {
    public final ArrayList a;

    public y8d1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8d1) && this.a.equals(((y8d1) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.a.hashCode() * 31);
    }
}
