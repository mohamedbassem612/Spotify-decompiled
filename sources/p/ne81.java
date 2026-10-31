package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ne81 {
    public final ArrayList a;

    public ne81(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne81) && this.a.equals(((ne81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
