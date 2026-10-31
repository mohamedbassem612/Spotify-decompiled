package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qg00 extends mh00 {
    public final ArrayList a;

    public qg00(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qg00) && this.a.equals(((qg00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
