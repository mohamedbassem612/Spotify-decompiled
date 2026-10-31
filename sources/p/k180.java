package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class k180 {
    public static final j180 Companion = new j180();
    public static final znb0[] e = {null, null, dm5.S(2, lx70.c), null};
    public final bq70 a;
    public final bq70 b;
    public final Map c;
    public final String d;

    public /* synthetic */ k180(int i, bq70 bq70Var, bq70 bq70Var2, Map map, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bq70Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bq70Var2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k180)) {
            return false;
        }
        k180 k180Var = (k180) obj;
        return u890.j(this.a, k180Var.a) && u890.j(this.b, k180Var.b) && u890.j(this.c, k180Var.c) && u890.j(this.d, k180Var.d);
    }

    public final int hashCode() {
        bq70 bq70Var = this.a;
        int iHashCode = (bq70Var == null ? 0 : bq70Var.hashCode()) * 31;
        bq70 bq70Var2 = this.b;
        int iHashCode2 = (iHashCode + (bq70Var2 == null ? 0 : bq70Var2.hashCode())) * 31;
        Map map = this.c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
