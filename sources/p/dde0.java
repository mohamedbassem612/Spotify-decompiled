package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dde0 implements ez00 {
    public final ArrayList a;

    public dde0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dde0) && this.a.equals(((dde0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
