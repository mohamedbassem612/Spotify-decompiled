package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eqv0 {
    public final String a;
    public final ArrayList b;

    public eqv0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqv0)) {
            return false;
        }
        eqv0 eqv0Var = (eqv0) obj;
        return u890.j(this.a, eqv0Var.a) && this.b.equals(eqv0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
