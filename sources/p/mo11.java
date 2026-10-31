package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mo11 {
    public final String a;
    public final ArrayList b;

    public mo11(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo11)) {
            return false;
        }
        mo11 mo11Var = (mo11) obj;
        return this.a.equals(mo11Var.a) && this.b.equals(mo11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
