package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class tj11 {
    public static final sj11 Companion = new sj11();
    public static final znb0[] b = {dm5.S(2, ijz0.Z0)};
    public final List a;

    public /* synthetic */ tj11(int i, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tj11) && u890.j(this.a, ((tj11) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
