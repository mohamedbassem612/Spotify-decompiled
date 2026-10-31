package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sh91 {
    public final ArrayList a;

    public sh91(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sh91) && this.a.equals(((sh91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
