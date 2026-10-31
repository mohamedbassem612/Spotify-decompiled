package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tm6 {
    public final String a;
    public final ArrayList b;

    public tm6(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm6)) {
            return false;
        }
        tm6 tm6Var = (tm6) obj;
        return u890.j(this.a, tm6Var.a) && this.b.equals(tm6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
