package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ufh {
    public final int a;
    public final ArrayList b;

    public ufh(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufh)) {
            return false;
        }
        ufh ufhVar = (ufh) obj;
        return this.a == ufhVar.a && this.b.equals(ufhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
