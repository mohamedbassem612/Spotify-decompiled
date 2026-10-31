package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cck extends hab0 implements xu30 {
    public final /* synthetic */ tob1 N0;
    public final /* synthetic */ hdn0 O0;
    public final /* synthetic */ tob1 X;
    public final /* synthetic */ tob1 Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ hdk a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ hdk d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ fb5 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cck(hdk hdkVar, iu30 iu30Var, boolean z, hdk hdkVar2, boolean z2, Function0 function0, fb5 fb5Var, boolean z3, iu30 iu30Var2, boolean z4, tob1 tob1Var, fhg1 fhg1Var, fhg1 fhg1Var2, fhg1 fhg1Var3, hdn0 hdn0Var) {
        super(3);
        this.a = hdkVar;
        this.b = iu30Var;
        this.c = z;
        this.d = hdkVar2;
        this.e = z2;
        this.f = function0;
        this.g = fb5Var;
        this.h = z3;
        this.i = iu30Var2;
        this.t = z4;
        this.X = tob1Var;
        this.Y = fhg1Var;
        this.Z = fhg1Var2;
        this.N0 = fhg1Var3;
        this.O0 = hdn0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        boolean z = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
        boolean z2 = p3v.b(i2cVar.d(), rck.b) >= 0;
        boolean z3 = z && z2;
        boolean z4 = !z && z2;
        hdk hdkVar = this.a;
        if (sok.t(hdkVar)) {
            x340Var.i0(1629857532);
            z47.h(hdkVar, this.b, (qim0) null, z2, x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(1629993994);
            x340Var.r(false);
            Boolean boolValueOf = Boolean.valueOf(this.c);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = c6k.i;
                x340Var.s0(objT);
            }
            hm5.a(boolValueOf, (qim0) null, (iu30) objT, (tl3) null, "concert_campaign_promo_card_expand_collapse", (iu30) null, apo.r(1801780469, new bck(z2, hdkVar, this.d, this.b, this.e, this.f, z3, z4, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0), x340Var), x340Var, 1597824, 42);
        }
        return rih1.a;
    }
}
