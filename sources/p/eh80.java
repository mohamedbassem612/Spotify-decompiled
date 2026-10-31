package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class eh80 {
    public static final dh80 Companion = new dh80();
    public static final znb0[] b = {dm5.S(2, lx70.d)};
    public final List a;

    public /* synthetic */ eh80(int i, List list) {
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
        return (obj instanceof eh80) && u890.j(this.a, ((eh80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
