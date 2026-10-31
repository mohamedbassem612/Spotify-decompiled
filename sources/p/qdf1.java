package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qdf1 {
    public final ArrayList a;

    public qdf1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdf1) && this.a.equals(((qdf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
