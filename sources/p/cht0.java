package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cht0 {
    public final String a;
    public final String b;
    public final ArrayList c;

    public cht0(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cht0)) {
            return false;
        }
        cht0 cht0Var = (cht0) obj;
        return u890.j(this.a, cht0Var.a) && u890.j(this.b, cht0Var.b) && this.c.equals(cht0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
