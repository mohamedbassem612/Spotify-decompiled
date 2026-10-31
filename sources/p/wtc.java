package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class wtc {
    public static final vtc Companion = new vtc();
    public static final znb0[] b = {dm5.S(2, xrc.c)};
    public final List a;

    public /* synthetic */ wtc(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            o6p1.t(i, 1, utc.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtc) && u890.j(this.a, ((wtc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public wtc(List list) {
        this.a = list;
    }
}
