package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y9a {
    public final ArrayList a;

    public y9a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9a) && this.a.equals(((y9a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
