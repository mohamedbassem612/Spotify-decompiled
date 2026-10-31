package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a881 extends b881 {
    public final ArrayList a;

    public a881(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a881) && this.a.equals(((a881) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
