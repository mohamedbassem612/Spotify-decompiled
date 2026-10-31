package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wy50 extends hab0 implements zu30 {
    public final /* synthetic */ sbk a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy50(sbk sbkVar, boolean z, boolean z2, boolean z3) {
        super(4);
        this.a = sbkVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        iu30 iu30Var = (iu30) obj4;
        sbk sbkVar = this.a;
        String strL = sbk.l(sbkVar);
        acq acqVarI = sbk.i(sbkVar);
        zob1 zob1VarH = sbk.h(sbkVar);
        pe peVarE = sbk.e(sbkVar);
        aod aodVarF = sbk.f(sbkVar);
        ce60 ce60VarK = sbk.k(sbkVar);
        iu30 iu30VarJ = sbk.j(sbkVar);
        boolean z = this.c;
        boolean z2 = this.d;
        return new az50(strL, acqVarI, iu30Var, this.b, (Context) obj2, z, z2, zob1VarH, aodVarF, ce60VarK, iu30VarJ, (ViewGroup) obj3, peVarE);
    }
}
