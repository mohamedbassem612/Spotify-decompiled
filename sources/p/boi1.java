package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class boi1 implements coi1 {
    public final ArrayList a;
    public final boolean b;

    public boi1(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boi1)) {
            return false;
        }
        boi1 boi1Var = (boi1) obj;
        return this.a.equals(boi1Var.a) && this.b == boi1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
