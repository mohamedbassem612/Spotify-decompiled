package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@o661
public final class cok {
    public static final bok Companion = new bok();
    public static final znb0[] b = {dm5.S(2, aok.b)};
    public final List a;

    public /* synthetic */ cok(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, znk.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cok) && u890.j(this.a, ((cok) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
