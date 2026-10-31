package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mcm1 extends qcm1 {
    public final ArrayList a;

    public mcm1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcm1) && this.a.equals(((mcm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
