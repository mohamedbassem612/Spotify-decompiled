package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class gfh1 {
    public static final ffh1 Companion = new ffh1();
    public static final znb0[] b = {dm5.S(2, vbh1.f)};
    public final List a;

    public /* synthetic */ gfh1(int i, List list) {
        if ((i & 1) == 0) {
            this.a = z6x.a;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gfh1) && u890.j(this.a, ((gfh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
