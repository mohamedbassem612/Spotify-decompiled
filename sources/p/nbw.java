package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nbw {
    public final ArrayList a;

    public nbw(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbw) && this.a.equals(((nbw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
