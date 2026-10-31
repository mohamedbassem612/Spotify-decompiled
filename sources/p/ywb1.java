package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ywb1 {
    public final ArrayList a;

    public ywb1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ywb1) && this.a.equals(((ywb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
