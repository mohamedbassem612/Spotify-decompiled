package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class puj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ComposeView b;
    public final /* synthetic */ tuj c;
    public final /* synthetic */ pbq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puj(tuj tujVar, ComposeView composeView, pbq pbqVar) {
        super(2);
        this.a = (byte) 2;
        this.c = tujVar;
        this.b = composeView;
        this.d = pbqVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.d;
        ComposeView composeView = this.b;
        tuj tujVar = this.c;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qsw.c(new obk1(composeView), apo.r(564822760, new ouj(tujVar, pbqVar), x340Var2), x340Var2, 48);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = szf0.a;
                    rzf0 rzf0VarB = szf0.b((View) x340Var4.k(AndroidCompositionLocals_androidKt.f));
                    mod.b(szf0.b.a(rzf0VarB != null ? rzf0VarB.a() : null), apo.r(-71810681, new puj(composeView, tujVar, pbqVar, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 56);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    mod.b(ef.a.a(tujVar.a), apo.r(534347335, new puj(composeView, tujVar, pbqVar, b2), x340Var6), x340Var6, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ puj(ComposeView composeView, tuj tujVar, pbq pbqVar, byte b) {
        super(2);
        this.a = b;
        this.b = composeView;
        this.c = tujVar;
        this.d = pbqVar;
    }
}
