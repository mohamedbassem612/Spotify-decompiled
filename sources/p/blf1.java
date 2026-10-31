package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class blf1 {
    public final ArrayList a;

    public blf1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blf1) && this.a.equals(((blf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
