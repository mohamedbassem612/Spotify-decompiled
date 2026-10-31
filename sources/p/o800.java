package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o800 {
    public final List a;
    public final String b;
    public final String c;

    public o800(String str, List list, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o800)) {
            return false;
        }
        o800 o800Var = (o800) obj;
        return this.a.equals(o800Var.a) && u890.j(this.b, o800Var.b) && u890.j(this.c, o800Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
