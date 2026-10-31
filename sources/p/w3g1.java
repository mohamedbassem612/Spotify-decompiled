package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w3g1 implements x3g1 {
    public final ArrayList a;

    public w3g1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3g1) && this.a.equals(((w3g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
