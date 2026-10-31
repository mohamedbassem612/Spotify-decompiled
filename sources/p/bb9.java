package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bb9 implements ez00 {
    public final ArrayList a;

    public bb9(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bb9) && this.a.equals(((bb9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
