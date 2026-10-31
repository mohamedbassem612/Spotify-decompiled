package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zzv0 extends cxm {
    public final ArrayList d;

    public zzv0(ArrayList arrayList) {
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzv0) && this.d.equals(((zzv0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
