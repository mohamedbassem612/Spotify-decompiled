package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p.a810;
import p.b810;
import p.beg;
import p.hyc;
import p.nb51;
import p.tdy0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public a810 getContract() {
        return a810.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public b810 isOverridable(hyc hycVar, hyc hycVar2, beg begVar) {
        if ((hycVar2 instanceof tdy0) && (hycVar instanceof tdy0)) {
            tdy0 tdy0Var = (tdy0) hycVar2;
            tdy0 tdy0Var2 = (tdy0) hycVar;
            if (u890.j(tdy0Var.getName(), tdy0Var2.getName())) {
                if (nb51.G(tdy0Var) && nb51.G(tdy0Var2)) {
                    return b810.a;
                }
                if (nb51.G(tdy0Var) || nb51.G(tdy0Var2)) {
                    return b810.b;
                }
            }
        }
        return b810.c;
    }
}
