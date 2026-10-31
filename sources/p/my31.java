package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class my31 {
    public final ArrayList a;

    public my31(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my31) && this.a.equals(((my31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
