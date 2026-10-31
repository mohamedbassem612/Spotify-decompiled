package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class b7f0 {
    public static final a7f0 Companion = new a7f0();
    public static final znb0[] b = {dm5.S(2, i0f0.f)};
    public final List a;

    public /* synthetic */ b7f0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, z6f0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7f0) && u890.j(this.a, ((b7f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
