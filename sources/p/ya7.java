package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ya7 implements za7 {
    public final ArrayList a;

    public ya7(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya7) && this.a.equals(((ya7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
