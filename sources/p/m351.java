package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m351 implements o351 {
    public final ArrayList a;

    public m351(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m351) && this.a.equals(((m351) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
