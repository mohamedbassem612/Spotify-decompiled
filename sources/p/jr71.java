package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jr71 {
    public final String a;
    public final ArrayList b;

    public jr71(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr71)) {
            return false;
        }
        jr71 jr71Var = (jr71) obj;
        return u890.j(this.a, jr71Var.a) && this.b.equals(jr71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
