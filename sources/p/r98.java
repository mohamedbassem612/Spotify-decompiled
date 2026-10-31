package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r98 implements ez00 {
    public final ArrayList a;

    public r98(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r98) && this.a.equals(((r98) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
