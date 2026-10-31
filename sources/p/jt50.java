package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jt50 {
    public final ArrayList a;
    public final String b;

    public jt50(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt50)) {
            return false;
        }
        jt50 jt50Var = (jt50) obj;
        return this.a.equals(jt50Var.a) && this.b.equals(jt50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
