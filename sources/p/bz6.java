package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bz6 implements ez00 {
    public final ArrayList a;

    public bz6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz6) && this.a.equals(((bz6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
