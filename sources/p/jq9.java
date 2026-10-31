package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class jq9 {
    public static final iq9 Companion = new iq9();
    public static final znb0[] b = {dm5.S(2, vc7.a1)};
    public final List a;

    public /* synthetic */ jq9(int i, List list) {
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
        return (obj instanceof jq9) && u890.j(this.a, ((jq9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
