package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tm11 {
    public final String a;
    public final ArrayList b;

    public tm11(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm11)) {
            return false;
        }
        tm11 tm11Var = (tm11) obj;
        return u890.j(this.a, tm11Var.a) && this.b.equals(tm11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
