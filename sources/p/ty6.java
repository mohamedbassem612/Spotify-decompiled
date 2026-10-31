package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ty6 {
    public final ArrayList a;

    public ty6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty6) && this.a.equals(((ty6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
