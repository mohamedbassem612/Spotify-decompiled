package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cr90 implements dr90 {
    public final ArrayList a;

    public cr90(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr90) && this.a.equals(((cr90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
