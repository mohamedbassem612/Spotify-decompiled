package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class awx0 extends cwx0 {
    public final ArrayList a;
    public final String b;

    public awx0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awx0)) {
            return false;
        }
        awx0 awx0Var = (awx0) obj;
        return this.a.equals(awx0Var.a) && u890.j(this.b, awx0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
