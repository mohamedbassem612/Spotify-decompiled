package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ks60 {
    public final ArrayList a;

    public ks60(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ks60) && this.a.equals(((ks60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
