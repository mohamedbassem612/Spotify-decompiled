package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qid1 implements tjd1 {
    public final ArrayList a;

    public qid1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qid1) && this.a.equals(((qid1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
