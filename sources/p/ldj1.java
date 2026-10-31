package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ldj1 implements ez00 {
    public final ArrayList a;

    public ldj1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldj1) && this.a.equals(((ldj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
