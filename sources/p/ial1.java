package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ial1 {
    public final ArrayList a;

    public ial1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ial1) && this.a.equals(((ial1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
