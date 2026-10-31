package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iq6 implements ez00 {
    public final ArrayList a;

    public iq6(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iq6) && this.a.equals(((iq6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
