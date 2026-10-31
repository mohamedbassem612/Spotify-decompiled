package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i0x0 extends hab0 implements vu30 {
    public final /* synthetic */ j0x0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0x0(j0x0 j0x0Var) {
        super(2);
        this.a = j0x0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            iac0 iac0Var = (iac0) x340Var2.k(jfe0.a);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            j0x0 j0x0Var = this.a;
            if (objT == m4cVar) {
                objT = j0x0Var.c.a(context, h0x0.b, h0x0.c);
                x340Var2.s0(objT);
            }
            iis iisVar = (iis) objT;
            Object objT2 = x340Var2.T();
            Object obj3 = objT2;
            if (objT2 == m4cVar) {
                MobiusLoop.Controller controllerA = j0x0Var.b.a(j0x0Var.e.a((i8h1) j0x0Var.f.get()));
                controllerA.c(new ku1(iisVar, (byte) 29));
                x340Var2.s0(controllerA);
                obj3 = controllerA;
            }
            MobiusLoop.Controller controller = (MobiusLoop.Controller) obj3;
            boolean zI = x340Var2.i(iac0Var) | x340Var2.i(controller) | x340Var2.i(j0x0Var) | x340Var2.i(iisVar);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new g0x0(iac0Var, controller, j0x0Var, iisVar);
                x340Var2.s0(objT3);
            }
            qxd0.i(iac0Var, (iu30) objT3, x340Var2);
            boolean zI2 = x340Var2.i(iisVar) | x340Var2.i(j0x0Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new hzu0(iisVar, j0x0Var, (byte) 24);
                x340Var2.s0(objT4);
            }
            dm5.a((iu30) objT4, (qim0) null, (iu30) null, x340Var2, 0, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
