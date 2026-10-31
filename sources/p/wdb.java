package p;

import android.os.Bundle;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.mobius.android.ObservableMutableLiveData;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wdb extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MobiusLoopViewModel b;
    public final /* synthetic */ fjt c;
    public final /* synthetic */ gus0 d;
    public final /* synthetic */ zdb e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ at80 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdb(MobiusLoopViewModel mobiusLoopViewModel, fjt fjtVar, gus0 gus0Var, zdb zdbVar, ArrayList arrayList, at80 at80Var, byte b) {
        super(2);
        this.a = b;
        this.b = mobiusLoopViewModel;
        this.c = fjtVar;
        this.d = gus0Var;
        this.e = zdbVar;
        this.f = arrayList;
        this.g = at80Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        tob1 tob1VarK;
        eus0 eus0Var;
        String str;
        fjt fjtVar;
        gus0 gus0Var;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                MobiusLoopViewModel mobiusLoopViewModel = this.b;
                ObservableMutableLiveData observableMutableLiveData = mobiusLoopViewModel.b;
                fjt fjtVar2 = this.c;
                ven0 ven0VarB = b2p1.B(observableMutableLiveData, new geb(fjtVar2), x340Var2, 0);
                gus0 gus0Var2 = this.d;
                xe01 xe01Var = gus0Var2 != null ? gus0Var2.e : null;
                if (xe01Var == null) {
                    x340Var2.i0(842834455);
                    x340Var2.r(false);
                    tob1VarK = null;
                } else {
                    x340Var2.i0(1966850858);
                    tob1VarK = f4p1.k(xe01Var, (iac0) null, x340Var2, 7);
                    x340Var2.r(false);
                }
                if (tob1VarK == null || (eus0Var = (eus0) tob1VarK.getValue()) == null) {
                    eus0Var = new eus0(31);
                }
                eus0 eus0Var2 = eus0Var;
                geb gebVar = (geb) ven0VarB.getValue();
                boolean zI = x340Var2.i(mobiusLoopViewModel);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    str = null;
                    fjtVar = fjtVar2;
                    gus0Var = gus0Var2;
                    qka qkaVar = new qka(1, mobiusLoopViewModel, MobiusLoopViewModel.class, "dispatchEvent", "dispatchEvent(Ljava/lang/Object;)V", 0, (byte) 7);
                    x340Var2.s0(qkaVar);
                    objT = qkaVar;
                } else {
                    str = null;
                    fjtVar = fjtVar2;
                    gus0Var = gus0Var2;
                }
                iu30 iu30Var = (nla0) objT;
                int iOrdinal = fjtVar.ordinal();
                zdb zdbVar = this.e;
                if (iOrdinal == 0) {
                    i = zdbVar.J1 ? 2131957130 : 2131956719;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return str;
                    }
                    i = 2131956718;
                }
                int i2 = i;
                c380 c380VarA = mqo1.A(this.f);
                Bundle bundle = ((zf30) zdbVar).f;
                String string = bundle != null ? bundle.getString("ARG_PREFILL_EMAIL") : str;
                boolean zV = zdbVar.Y0().v();
                boolean zQ = zdbVar.Y0().q();
                boolean zG = zdbVar.Y0().G();
                iu30 iu30Var2 = iu30Var;
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = c7b.g;
                    x340Var2.s0(objT2);
                }
                iu30 iu30Var3 = (iu30) objT2;
                boolean zI2 = x340Var2.i(zdbVar);
                Object objT3 = x340Var2.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new vdb(zdbVar, (byte) 0);
                    x340Var2.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean zI3 = x340Var2.i(zdbVar);
                Object objT4 = x340Var2.T();
                if (zI3 || objT4 == m4cVar) {
                    objT4 = new vdb(zdbVar, (byte) 1);
                    x340Var2.s0(objT4);
                }
                Function0 function1 = (Function0) objT4;
                boolean zI4 = x340Var2.i(gus0Var);
                Object objT5 = x340Var2.T();
                if (zI4 || objT5 == m4cVar) {
                    objT5 = new tla(gus0Var, (byte) 11);
                    x340Var2.s0(objT5);
                }
                iu30 iu30Var4 = (iu30) objT5;
                boolean zE = x340Var2.e(fjtVar.ordinal()) | x340Var2.i(mobiusLoopViewModel);
                Object objT6 = x340Var2.T();
                if (zE || objT6 == m4cVar) {
                    objT6 = new kd8(fjtVar, mobiusLoopViewModel, (byte) 24);
                    x340Var2.s0(objT6);
                }
                vbe.e(gebVar, iu30Var2, i2, c380VarA, string, iu30Var3, (qim0) null, zV, zQ, function0, function1, this.g, eus0Var2, zG, iu30Var4, (iu30) objT6, x340Var2, 196608);
                j0f0 j0f0Var = (j0f0) zdbVar.a2.getValue();
                if (j0f0Var == null) {
                    x340Var2.i0(844213676);
                    x340Var2.r(false);
                    return rih1Var;
                }
                x340Var2.i0(844213677);
                boolean zI5 = x340Var2.i(zdbVar);
                Object objT7 = x340Var2.T();
                if (zI5 || objT7 == m4cVar) {
                    objT7 = new vdb(zdbVar, (byte) 2);
                    x340Var2.s0(objT7);
                }
                yoi1.e(j0f0Var, (Function0) objT7, 0, x340Var2, 8);
                x340Var2.r(false);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(918246765, new wdb(this.b, this.c, this.d, this.e, this.f, this.g, (byte) 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
