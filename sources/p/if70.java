package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class if70 {
    public static final hf70 Companion = new hf70();
    public static final znb0[] b = {dm5.S(2, h050.S0)};
    public final List a;

    public /* synthetic */ if70(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, gf70.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if70) && u890.j(this.a, ((if70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
