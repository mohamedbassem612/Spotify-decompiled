package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ki00 extends l6o1 {
    public final ArrayList b;
    public final String c;
    public final Integer d;

    public ki00(Integer num, String str, ArrayList arrayList) {
        this.b = arrayList;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki00)) {
            return false;
        }
        ki00 ki00Var = (ki00) obj;
        return this.b.equals(ki00Var.b) && u890.j(this.c, ki00Var.c) && this.d.equals(ki00Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
