package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class geb0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ heb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ geb0(heb0 heb0Var, byte b) {
        super(2);
        this.a = b;
        this.b = heb0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        heb0 heb0Var = this.b;
        boolean z = false;
        byte b2 = 2;
        byte b3 = 1;
        switch (b) {
            case 0:
                String str = (String) obj;
                int iIntValue = ((Number) obj2).intValue();
                leb0 leb0Var = heb0Var.a;
                i8h1 i8h1Var = leb0Var.a;
                tdl0 tdl0Var = leb0Var.b;
                Integer numValueOf = Integer.valueOf(iIntValue);
                x6h1 x6h1VarC = tdl0Var.b.c();
                x6h1VarC.i.add(new a7h1("language_row", str, numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                heb0Var.e.setValue(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null));
                Consumer consumer = heb0Var.d;
                if (consumer != null) {
                    consumer.accept(new xdb0(str));
                }
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    eeb0 eeb0Var = (eeb0) heb0Var.c.getValue();
                    leb0 leb0Var2 = heb0Var.a;
                    tv80 tv80Var = (tv80) heb0Var.e.getValue();
                    o860 o860Var = heb0Var.b;
                    boolean zI = x340Var2.i(heb0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        geb0 geb0Var = new geb0(heb0Var, z ? (byte) 1 : (byte) 0);
                        x340Var2.s0(geb0Var);
                        obj3 = geb0Var;
                    }
                    vu30 vu30Var = (vu30) obj3;
                    boolean zI2 = x340Var2.i(heb0Var);
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        pdb0 pdb0Var = new pdb0(heb0Var, (byte) 1);
                        x340Var2.s0(pdb0Var);
                        obj4 = pdb0Var;
                    }
                    xfo1.h(eeb0Var, leb0Var2, tv80Var, o860Var, vu30Var, (iu30) obj4, x340Var2, 0);
                }
                break;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(1407590404, new geb0(heb0Var, b3), x340Var4), x340Var4, 3072, 7);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    kiv kivVar = szf0.a;
                    rzf0 rzf0VarB = szf0.b((View) x340Var6.k(AndroidCompositionLocals_androidKt.f));
                    mod.c(new ely0[]{kivVar.a(rzf0VarB), szf0.b.a(rzf0VarB != null ? rzf0VarB.a() : null)}, apo.r(900168881, new geb0(heb0Var, b2), x340Var6), x340Var6, 56);
                }
                break;
        }
        return rih1Var;
    }
}
