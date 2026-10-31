package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zdf1 {
    public final ArrayList a;

    public zdf1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdf1) && this.a.equals(((zdf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
