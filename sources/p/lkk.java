package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lkk {
    public final ArrayList a;

    public lkk(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkk) && this.a.equals(((lkk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
