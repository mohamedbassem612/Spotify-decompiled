package kotlin.reflect.jvm.internal.impl.resolve;

import p.a810;
import p.b810;
import p.beg;
import p.hyc;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public interface ExternalOverridabilityCondition {
    a810 getContract();

    b810 isOverridable(hyc hycVar, hyc hycVar2, beg begVar);
}
