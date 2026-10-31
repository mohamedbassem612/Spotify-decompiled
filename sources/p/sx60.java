package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class sx60 {
    public static final rx60 Companion = new rx60();
    public static final znb0[] b = {dm5.S(2, h050.R0)};
    public final List a;

    public /* synthetic */ sx60(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, qx60.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx60) && u890.j(this.a, ((sx60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
