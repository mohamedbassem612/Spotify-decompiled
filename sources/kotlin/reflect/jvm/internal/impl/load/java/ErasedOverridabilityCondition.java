package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import p.a810;
import p.a8b0;
import p.aht;
import p.b810;
import p.beg;
import p.c8a0;
import p.dxq0;
import p.ep20;
import p.exq0;
import p.f46;
import p.hyc;
import p.i46;
import p.iwz0;
import p.l1d;
import p.l1h1;
import p.n561;
import p.nfz;
import p.nwz0;
import p.p7h;
import p.rob0;
import p.sgg1;
import p.xw81;
import p.z561;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public a810 getContract() {
        return a810.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public b810 isOverridable(hyc hycVar, hyc hycVar2, beg begVar) {
        if (hycVar2 instanceof c8a0) {
            c8a0 c8a0Var = (c8a0) hycVar2;
            if (c8a0Var.getTypeParameters().isEmpty()) {
                dxq0 dxq0VarI = exq0.i(hycVar, hycVar2);
                if ((dxq0VarI != null ? dxq0VarI.b() : 0) == 0) {
                    n561 sgg1Var = new sgg1(aht.h, new i46(c8a0Var.F(), (byte) 1));
                    a8b0 a8b0Var = c8a0Var.h;
                    a8b0Var.getClass();
                    n561 n561VarZ = z561.Z(z561.i0(new n561[]{sgg1Var, z561.h0(a8b0Var)}));
                    rob0 rob0Var = c8a0Var.t;
                    ep20 ep20Var = new ep20(z561.Z(f46.I(new n561[]{n561VarZ, new i46(p7h.N(rob0Var != null ? rob0Var.getType() : null), (byte) 1)})));
                    while (ep20Var.hasNext()) {
                        a8b0 a8b0Var2 = (a8b0) ep20Var.next();
                        if (a8b0Var2.r0().isEmpty() || (a8b0Var2.w0() instanceof nwz0)) {
                        }
                    }
                    hyc hycVarBuild = (hyc) hycVar.d(new l1h1(new iwz0()));
                    if (hycVarBuild != null) {
                        if (hycVarBuild instanceof xw81) {
                            xw81 xw81Var = (xw81) hycVarBuild;
                            if (!xw81Var.getTypeParameters().isEmpty()) {
                                hycVarBuild = xw81Var.n0().n().build();
                                hycVarBuild.getClass();
                            }
                        }
                        if (nfz.a[l1d.C(exq0.c.n(hycVarBuild, hycVar2, false).b())] == 1) {
                            return b810.a;
                        }
                    }
                }
            }
        }
        return b810.c;
    }
}
