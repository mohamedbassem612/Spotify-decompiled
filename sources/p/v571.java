package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class v571 {
    public final ArrayList a;

    public v571(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v571) && this.a.equals(((v571) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
