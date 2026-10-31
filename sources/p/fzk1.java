package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class fzk1 extends c0l1 {
    public static final ezk1 Updates = new ezk1();
    public static final znb0[] c = {dm5.S(2, kvj1.T0)};
    public final List b;

    public /* synthetic */ fzk1(int i, List list) {
        if ((i & 1) == 0) {
            this.b = z6x.a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fzk1) && u890.j(this.b, ((fzk1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public fzk1(List list) {
        this.b = list;
    }
}
