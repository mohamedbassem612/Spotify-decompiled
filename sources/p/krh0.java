package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class krh0 implements lrh0 {
    public final ArrayList a;

    public krh0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krh0) && this.a.equals(((krh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
