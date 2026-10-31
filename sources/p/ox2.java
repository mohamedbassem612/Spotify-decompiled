package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ox2 {
    public final List a;
    public final Locale b;
    public final ArrayList c;
    public final String d;

    public ox2(List list, Locale locale, ArrayList arrayList, String str) {
        this.a = list;
        this.b = locale;
        this.c = arrayList;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox2)) {
            return false;
        }
        ox2 ox2Var = (ox2) obj;
        return this.a.equals(ox2Var.a) && u890.j(this.b, ox2Var.b) && this.c.equals(ox2Var.c) && u890.j(this.d, ox2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Locale locale = this.b;
        int iF = p3d1.f(this.c, (iHashCode + (locale == null ? 0 : locale.hashCode())) * 31, 31);
        String str = this.d;
        return iF + (str != null ? str.hashCode() : 0);
    }
}
