package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nan0 implements xn11 {
    public final ArrayList a;

    public nan0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nan0) && this.a.equals(((nan0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
