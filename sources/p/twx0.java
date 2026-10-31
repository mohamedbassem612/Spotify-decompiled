package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class twx0 implements uwx0 {
    public final ArrayList a;

    public twx0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof twx0) && this.a.equals(((twx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
