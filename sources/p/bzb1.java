package p;

import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bzb1 implements dzb1 {
    public final FlowableMap a;
    public final Function0 b;

    public bzb1(FlowableMap flowableMap, Function0 function0) {
        this.a = flowableMap;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bzb1) {
            bzb1 bzb1Var = (bzb1) obj;
            if (this.a == bzb1Var.a && this.b.equals(bzb1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
