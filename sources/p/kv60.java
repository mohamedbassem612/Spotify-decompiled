package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class kv60 {
    public static final jv60 Companion = new jv60();
    public static final znb0[] d = {null, null, dm5.S(2, h050.Q0)};
    public final Integer a;
    public final String b;
    public final List c;

    public /* synthetic */ kv60(int i, Integer num, String str, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv60)) {
            return false;
        }
        kv60 kv60Var = (kv60) obj;
        return u890.j(this.a, kv60Var.a) && u890.j(this.b, kv60Var.b) && u890.j(this.c, kv60Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
