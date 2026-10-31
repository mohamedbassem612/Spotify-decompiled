package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yso0 implements h0r0 {
    public final qyj a;
    public final hs3 b;
    public final uso0 c;
    public final bnj0 d;
    public final yvk0 e;
    public final cbr0 f;

    public yso0(qyj qyjVar, hs3 hs3Var, uso0 uso0Var, bnj0 bnj0Var, yvk0 yvk0Var) {
        this.a = qyjVar;
        this.b = hs3Var;
        this.c = uso0Var;
        this.d = bnj0Var;
        this.e = yvk0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.G1("PUSHOPTIN", "pushoptin", 1604, "pushoptin"), new lik1("spotify:internal:push-opt-in"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public static final void d(yso0 yso0Var, ven0 ven0Var) {
        if (((Boolean) ven0Var.getValue()).booleanValue()) {
            return;
        }
        ven0Var.setValue(Boolean.TRUE);
        ((ks3) yso0Var.b).a(new ip41(0, 3));
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-503829454, new xso0(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1086051571);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = wso0.b;
                x340Var.s0(objT);
            }
            q3p1.b(48, 1, (Function0) objT, x340Var, false);
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = wso0.c;
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var, 48);
            e1r0 e1r0Var = new e1r0((byte) 4);
            boolean zI = x340Var.i(ven0Var) | x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new j9n0(this, ven0Var, (byte) 19);
                x340Var.s0(objT3);
            }
            ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) objT3, x340Var);
            boolean zI2 = x340Var.i(this) | x340Var.i(ven0Var);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new hyg0(this, ven0Var, (lnm) null, (byte) 27);
                x340Var.s0(objT4);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT4);
            boolean zI3 = x340Var.i(this) | x340Var.i(ihg0VarE) | x340Var.i(ven0Var);
            Object objT5 = x340Var.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new dt90(this, ihg0VarE, ven0Var, (byte) 29);
                x340Var.s0(objT5);
            }
            Function0 function0 = (Function0) objT5;
            boolean zI4 = x340Var.i(ven0Var) | x340Var.i(this);
            Object objT6 = x340Var.T();
            if (zI4 || objT6 == m4cVar) {
                objT6 = new s2n0(this, ven0Var, (byte) 24);
                x340Var.s0(objT6);
            }
            otw.c(new qj0(this.e, function0, (Function0) objT6), new zro0(context.getString(2131963435), context.getString(2131959209), context.getString(2131963435), context.getString(2131959156), context.getString(2131958089)), (qim0) null, (ipb1) null, x340Var, 8, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xso0(this, i);
        }
    }
}
