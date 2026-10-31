package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class ros0 {
    public static final qos0 Companion = new qos0();
    public static final znb0[] b = {dm5.S(2, v0r0.Y0)};
    public final Map a;

    public /* synthetic */ ros0(int i, Map map) {
        if ((i & 1) == 0) {
            this.a = b7x.a;
        } else {
            this.a = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ros0) && u890.j(this.a, ((ros0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ros0(Map map) {
        this.a = map;
    }

    public /* synthetic */ ros0() {
        this(b7x.a);
    }
}
