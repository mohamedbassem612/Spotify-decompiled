package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bg51 {
    public final ArrayList a;

    public bg51(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg51) && this.a.equals(((bg51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
