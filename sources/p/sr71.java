package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sr71 {
    public final String a;
    public final ArrayList b;

    public sr71(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr71)) {
            return false;
        }
        sr71 sr71Var = (sr71) obj;
        return u890.j(this.a, sr71Var.a) && this.b.equals(sr71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
