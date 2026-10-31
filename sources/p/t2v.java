package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t2v implements v2v {
    public final ArrayList a;
    public final Throwable b;

    public t2v(ArrayList arrayList, Throwable th) {
        this.a = arrayList;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2v)) {
            return false;
        }
        t2v t2vVar = (t2v) obj;
        return this.a.equals(t2vVar.a) && this.b.equals(t2vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
