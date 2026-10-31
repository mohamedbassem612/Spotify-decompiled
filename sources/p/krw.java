package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class krw implements lrw {
    public final ArrayList a;

    public krw(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krw) && this.a.equals(((krw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
