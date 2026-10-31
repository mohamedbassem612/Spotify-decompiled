package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fh3 {
    public final ArrayList a;

    public fh3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh3) && this.a.equals(((fh3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
