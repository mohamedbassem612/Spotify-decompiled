package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jel1 {
    public final ArrayList a;

    public jel1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jel1) && this.a.equals(((jel1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(100) * 31);
    }
}
