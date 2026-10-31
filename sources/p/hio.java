package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hio implements kio {
    public final ArrayList a;

    public hio(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hio) && this.a.equals(((hio) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
