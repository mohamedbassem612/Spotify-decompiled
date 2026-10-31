package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s9h0 implements cah0 {
    public final ArrayList a;

    public s9h0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9h0) && this.a.equals(((s9h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
