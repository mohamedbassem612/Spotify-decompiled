package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hhg0 extends wqn1 {
    public final ArrayList i;

    public hhg0(ArrayList arrayList) {
        this.i = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hhg0) && this.i.equals(((hhg0) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }
}
