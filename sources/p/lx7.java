package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lx7 {
    public final ArrayList a;

    public lx7(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lx7) && this.a.equals(((lx7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
