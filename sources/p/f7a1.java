package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f7a1 implements ez00 {
    public final ArrayList a;

    public f7a1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7a1) && this.a.equals(((f7a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
