package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m0l extends p0l {
    public final ArrayList a;

    public m0l(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0l) && this.a.equals(((m0l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
