package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class zv0 {
    public static final yv0 Companion = new yv0();
    public static final znb0[] b = {dm5.S(2, p4.X0)};
    public final Map a;

    public /* synthetic */ zv0(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            o6p1.t(i, 1, xv0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zv0) && u890.j(this.a, ((zv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
