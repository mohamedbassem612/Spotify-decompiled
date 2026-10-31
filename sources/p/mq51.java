package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mq51 {
    public final Map a;
    public final boolean b;

    public mq51(Map map, boolean z) {
        this.a = map;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq51)) {
            return false;
        }
        mq51 mq51Var = (mq51) obj;
        return this.a.equals(mq51Var.a) && this.b == mq51Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
