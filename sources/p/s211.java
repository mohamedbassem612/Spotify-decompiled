package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s211 implements ez00 {
    public final ArrayList a;

    public s211(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s211) && this.a.equals(((s211) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
