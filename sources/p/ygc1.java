package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@o661
public final class ygc1 {
    public static final xgc1 Companion = new xgc1();
    public static final znb0[] b = {dm5.S(2, l4b1.X0)};
    public final List a;

    public /* synthetic */ ygc1(int i, List list) {
        if ((i & 1) == 0) {
            this.a = z6x.a;
        } else {
            this.a = list;
        }
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ygc1) && u890.j(this.a, ((ygc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
