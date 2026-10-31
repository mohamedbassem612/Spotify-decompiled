package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nx60 extends px60 {
    public final ArrayList a;

    public nx60(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx60) && this.a.equals(((nx60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
