package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fid1 {
    public final ArrayList a;

    public fid1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fid1) && this.a.equals(((fid1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
