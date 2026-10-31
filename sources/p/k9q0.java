package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k9q0 implements p9q0 {
    public final ArrayList a;
    public final String b;

    public k9q0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k9q0)) {
            return false;
        }
        k9q0 k9q0Var = (k9q0) obj;
        return this.a.equals(k9q0Var.a) && this.b.equals(k9q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
