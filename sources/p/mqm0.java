package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mqm0 implements gfh0 {
    public final lqm0 a;

    public mqm0(lqm0 lqm0Var) {
        this.a = lqm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqm0) && u890.j(this.a, ((mqm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        return this.a.maxIntrinsicHeight(p890Var, dio1.u(p890Var), i);
    }

    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        return this.a.maxIntrinsicWidth(p890Var, dio1.u(p890Var), i);
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m242measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        return this.a.measure-3p2s80s(ifh0Var, dio1.u(ifh0Var), j);
    }

    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        return this.a.minIntrinsicHeight(p890Var, dio1.u(p890Var), i);
    }

    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        return this.a.minIntrinsicWidth(p890Var, dio1.u(p890Var), i);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
