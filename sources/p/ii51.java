package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ii51 extends ki51 {
    public final ArrayList a;

    public ii51(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ii51) && this.a.equals(((ii51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (l1d.C(2) * 31);
    }
}
