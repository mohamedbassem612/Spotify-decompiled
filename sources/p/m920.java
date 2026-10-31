package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m920 {
    public final ArrayList a;

    public m920(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m920) && this.a.equals(((m920) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
