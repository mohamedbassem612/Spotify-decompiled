package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bvp0 implements jn60 {
    public final hvl1 a;

    public bvp0(hvl1 hvl1Var) {
        this.a = hvl1Var;
    }

    public final List d(op80 op80Var) {
        return Collections.singletonList(new rup0(op80Var, new tup0(this.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvp0) || !this.a.equals(((bvp0) obj).a)) {
            return false;
        }
        yz21 yz21Var = yz21.d;
        return yz21Var.equals(yz21Var);
    }

    public final yz21 f() {
        return yz21.d;
    }

    public final String getId() {
        return "offline-ready-shelf";
    }

    public final int hashCode() {
        return (0 * 31) + 103145323 + ((this.a.hashCode() - 1150326230) * 31);
    }
}
