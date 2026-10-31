package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class rgv {
    public static final qgv Companion = new qgv();
    public static final znb0[] c = {dm5.S(2, xzu.h), null};
    public final List a;
    public final int b;

    public /* synthetic */ rgv(int i, int i2, List list) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, pgv.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgv)) {
            return false;
        }
        rgv rgvVar = (rgv) obj;
        return u890.j(this.a, rgvVar.a) && this.b == rgvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
