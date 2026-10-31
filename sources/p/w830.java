package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w830 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ r7x0 d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w830(boolean z, boolean z2, long j, r7x0 r7x0Var, iu30 iu30Var) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = r7x0Var;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = this.a;
            boolean z2 = this.b;
            iu30 iu30Var = this.e;
            if (z) {
                x340Var2.i0(-1989604507);
                znx znxVar = znx.c;
                jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131960429));
                x340Var2.i0(-479814027);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarR = u291.r(nim0Var, 22.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0VarR, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                if (!z2) {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new y720(iu30Var, (byte) 23);
                        x340Var2.s0(objT);
                    }
                    qim0VarB = qim0VarB.then(bin.x(nim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15));
                }
                x340Var2.r(false);
                w0h1.a(znxVar, jslVar, qim0VarB, this.c, 0L, false, x340Var2, znx.d, 48);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1989167252);
                x340Var2.r(false);
            }
            r7x0 r7x0Var = this.d;
            int i = r7x0Var.i;
            boolean z3 = !z2;
            boolean zG2 = x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new y720(iu30Var, (byte) 24);
                x340Var2.s0(objT2);
            }
            k8p1.a(i, 2131820861, z3, (Function0) objT2, x340Var2, 0);
            String strO0 = cwl1.o0(x340Var2, 2131960532);
            uwr uwrVar2 = cbx.a;
            x340 x340Var3 = x340Var2;
            uwo1.e(strO0, (qim0) null, lee1.a(cbx.d(x340Var2).j, this.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var3, 0, 0, 2042);
            int i2 = r7x0Var.j;
            boolean zG3 = x340Var3.g(iu30Var);
            Object objT3 = x340Var3.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new y720(iu30Var, (byte) 25);
                x340Var3.s0(objT3);
            }
            k8p1.a(i2, 2131820862, z3, (Function0) objT3, x340Var3, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
