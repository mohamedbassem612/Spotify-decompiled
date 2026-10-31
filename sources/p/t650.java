package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t650 {
    public final ArrayList a;

    public t650(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t650) && this.a.equals(((t650) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
