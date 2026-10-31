package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y67 {
    public final ArrayList a;

    public y67(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y67) && this.a.equals(((y67) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
