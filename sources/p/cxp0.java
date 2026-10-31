package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cxp0 {
    public final ArrayList a;

    public cxp0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxp0) && this.a.equals(((cxp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
