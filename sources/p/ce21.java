package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ce21 {
    public final ArrayList a;

    public ce21(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce21) && this.a.equals(((ce21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
