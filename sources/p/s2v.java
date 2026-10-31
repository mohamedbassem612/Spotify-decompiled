package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s2v implements v2v {
    public final ArrayList a;

    public s2v(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2v) && this.a.equals(((s2v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
