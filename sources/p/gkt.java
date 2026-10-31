package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gkt extends m87 {
    public final ArrayList d;

    public gkt(ArrayList arrayList) {
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkt) && this.d.equals(((gkt) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
