package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class meo {
    public final ArrayList a;

    public meo(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof meo) && this.a.equals(((meo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
