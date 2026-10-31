package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kde1 implements lde1 {
    public final ArrayList a;

    public kde1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kde1) && this.a.equals(((kde1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
