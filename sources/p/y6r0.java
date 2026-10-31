package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class y6r0 implements Serializable {
    public static final x6r0 Companion = new x6r0();
    public final String a;

    public /* synthetic */ y6r0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            o6p1.t(i, 1, w6r0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6r0) && u890.j(this.a, ((y6r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public y6r0(String str) {
        this.a = str;
    }
}
