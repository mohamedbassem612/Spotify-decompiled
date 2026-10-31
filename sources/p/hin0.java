package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hin0 {
    public final ArrayList a;
    public final ArrayList b;

    public hin0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hin0)) {
            return false;
        }
        hin0 hin0Var = (hin0) obj;
        return this.a.equals(hin0Var.a) && this.b.equals(hin0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
