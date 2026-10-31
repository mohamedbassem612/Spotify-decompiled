package p;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jhr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ khr0 b;
    public final /* synthetic */ op80 c;
    public final /* synthetic */ bz11 d;
    public final /* synthetic */ xpw e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ bpb1 h;
    public final /* synthetic */ p40 i;
    public final /* synthetic */ idd1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhr0(op80 op80Var, khr0 khr0Var, bz11 bz11Var, xpw xpwVar, Bundle bundle, boolean z, bpb1 bpb1Var, p40 p40Var, idd1 idd1Var) {
        super(2);
        this.a = (byte) 0;
        this.c = op80Var;
        this.b = khr0Var;
        this.d = bz11Var;
        this.e = xpwVar;
        this.f = bundle;
        this.g = z;
        this.h = bpb1Var;
        this.i = p40Var;
        this.t = idd1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    kiv kivVar = gfe0.a;
                    op80 op80Var = this.c;
                    boolean zI = x340Var2.i(op80Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new u6j0(op80Var, (byte) 26);
                        x340Var2.s0(objT);
                    }
                    mod.b(gfe0.d((Function0) objT, x340Var2), apo.r(323693920, new q3(this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.t), x340Var2), x340Var2, 56);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    khr0 khr0Var = this.b;
                    rce0.a(khr0Var.i, apo.r(-1758770656, new jhr0(this.c, khr0Var, this.d, this.e, this.f, this.g, this.h, this.i, this.t), x340Var4), x340Var4, 48);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-833602191, new jhr0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (byte) 1), x340Var6), x340Var6, 3078, 6);
                }
                break;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x340Var8.b0();
                } else {
                    kiv kivVar2 = szf0.a;
                    rzf0 rzf0VarB = szf0.b((View) x340Var8.k(AndroidCompositionLocals_androidKt.f));
                    mod.c(new ely0[]{kivVar2.a(rzf0VarB), szf0.b.a(rzf0VarB != null ? rzf0VarB.a() : null)}, apo.r(74690212, new jhr0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (byte) 2), x340Var8), x340Var8, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jhr0(khr0 khr0Var, op80 op80Var, bz11 bz11Var, xpw xpwVar, Bundle bundle, boolean z, bpb1 bpb1Var, p40 p40Var, idd1 idd1Var, byte b) {
        super(2);
        this.a = b;
        this.b = khr0Var;
        this.c = op80Var;
        this.d = bz11Var;
        this.e = xpwVar;
        this.f = bundle;
        this.g = z;
        this.h = bpb1Var;
        this.i = p40Var;
        this.t = idd1Var;
    }
}
