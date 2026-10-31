package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x7d implements z7d {
    public final ArrayList a;

    public x7d(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7d) && this.a.equals(((x7d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
