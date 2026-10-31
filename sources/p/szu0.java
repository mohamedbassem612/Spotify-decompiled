package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class szu0 {
    public final ArrayList a;

    public szu0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szu0) && this.a.equals(((szu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
