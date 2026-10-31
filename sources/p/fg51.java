package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fg51 {
    public final ArrayList a;

    public fg51(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg51) && this.a.equals(((fg51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
