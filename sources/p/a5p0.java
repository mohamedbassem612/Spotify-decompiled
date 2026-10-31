package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a5p0 {
    public final FlowableJust a;
    public final Flowable b;
    public final Flowable c;

    public a5p0(FlowableJust flowableJust, Flowable flowable, Flowable flowable2) {
        this.a = flowableJust;
        this.b = flowable;
        this.c = flowable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a5p0) {
            a5p0 a5p0Var = (a5p0) obj;
            if (this.a == a5p0Var.a && this.b.equals(a5p0Var.b) && this.c.equals(a5p0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
    }
}
