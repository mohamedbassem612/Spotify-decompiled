package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class cot {
    public static final bot Companion = new bot();
    public static final znb0[] d = {null, null, dm5.S(2, u6t.h)};
    public final String a;
    public final String b;
    public final Map c;

    public /* synthetic */ cot(String str, int i, Map map, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, aot.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = b7x.a;
        } else {
            this.c = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cot)) {
            return false;
        }
        cot cotVar = (cot) obj;
        return u890.j(this.a, cotVar.a) && u890.j(this.b, cotVar.b) && u890.j(this.c, cotVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public cot(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }
}
