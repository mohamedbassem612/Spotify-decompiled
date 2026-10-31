package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x960 implements da60 {
    public final ArrayList a;

    public x960(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x960) && this.a.equals(((x960) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
