package p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yfs0 {
    public final AtomicBoolean a;
    public final List b;

    public yfs0(AtomicBoolean atomicBoolean) {
        ArrayList arrayList = new ArrayList();
        this.a = atomicBoolean;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfs0)) {
            return false;
        }
        yfs0 yfs0Var = (yfs0) obj;
        return this.a.equals(yfs0Var.a) && this.b.equals(yfs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
