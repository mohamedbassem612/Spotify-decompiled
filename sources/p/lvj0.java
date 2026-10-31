package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lvj0 {
    public final int a;
    public final ArrayList b;

    public lvj0(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvj0)) {
            return false;
        }
        lvj0 lvj0Var = (lvj0) obj;
        return this.a == lvj0Var.a && this.b.equals(lvj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
