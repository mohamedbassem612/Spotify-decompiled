package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class h3l1 extends l4l1 {
    public static final g3l1 Companion = new g3l1();
    public static final znb0[] g = {null, null, null, null, dm5.S(2, kvj1.Z0)};
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String[] f;

    public /* synthetic */ h3l1(int i, int i2, String str, String str2, String str3, String[] strArr) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, f3l1.a.getDescriptor());
            throw null;
        }
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3l1)) {
            return false;
        }
        h3l1 h3l1Var = (h3l1) obj;
        return this.b == h3l1Var.b && u890.j(this.c, h3l1Var.c) && u890.j(this.d, h3l1Var.d) && u890.j(this.e, h3l1Var.e) && u890.j(this.f, h3l1Var.f);
    }

    public final int hashCode() {
        return cy30.d(cy30.d(cy30.d(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e) + Arrays.hashCode(this.f);
    }
}
