package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vv7 implements h0r0 {
    public final qyj a;
    public final yxb0 b;
    public final r6q c;
    public final haa0 d;
    public final dc31 e;
    public final cw7 f;
    public final kt91 g;
    public final Context h;
    public final boolean i;
    public final cbr0 j;

    public vv7(qyj qyjVar, yxb0 yxb0Var, r6q r6qVar, haa0 haa0Var, dc31 dc31Var, cw7 cw7Var, kt91 kt91Var, Context context, boolean z) {
        this.a = qyjVar;
        this.b = yxb0Var;
        this.c = r6qVar;
        this.d = haa0Var;
        this.e = dc31Var;
        this.f = cw7Var;
        this.g = kt91Var;
        this.h = context;
        this.i = z;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.j = new cbr0(new dbr0[]{new bn70(yon1.R(), nik1.M6, (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.j;
    }

    public final p2r0 b() {
        return this.a.a(apo.j(1497934684, new tv7(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1431704);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            yxb0 yxb0Var = this.b;
            rih1 rih1Var = rih1.a;
            otw.c(yxb0Var, rih1Var, null, wpb1.C("AudioLanguagePageStateHolder", yxb0Var, rih1Var, x340Var, 390, 8), x340Var, 48, 4);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tv7(this, i, (byte) 0);
        }
    }

    public final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-243454100);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            haa0 haa0Var = this.d;
            if (objT == m4cVar) {
                objT = haa0Var.g();
                x340Var.s0(objT);
            }
            ven0 ven0VarI = xto.i((mr20) objT, z6x.a, x340Var, 48);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = haa0Var.h();
                x340Var.s0(objT2);
            }
            ven0 ven0VarI2 = xto.i((mr20) objT2, (Object) null, x340Var, 48);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = mgo1.e(0, 1, 0, 5);
                x340Var.s0(objT3);
            }
            sen0 sen0Var = (sen0) objT3;
            boolean zI = x340Var.i(sen0Var) | x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new k96(sen0Var, this, (lnm) null, (byte) 13);
                x340Var.s0(objT4);
            }
            qxd0.t(sen0Var, x340Var, (vu30) objT4);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = new ew7();
                x340Var.s0(objT5);
            }
            ew7 ew7Var = (ew7) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = this.c.a(new uv7(sen0Var, this, (byte) 0), new q01(this.f, (byte) 18), ew7Var);
                x340Var.s0(objT6);
            }
            ccb0 ccb0Var = (ccb0) objT6;
            String strO0 = cwl1.o0(x340Var, 2131952571);
            ArrayList arrayListJ = guo1.J((List) ven0VarI.getValue());
            yab0 yab0Var = (yab0) ven0VarI2.getValue();
            acb0 acb0Var = new acb0(strO0, yab0Var != null ? yab0Var.a() : null, arrayListJ, false);
            otw.c(ccb0Var, acb0Var, null, wpb1.C("AudioLanguagePageLanguagePickerStateHolder", ccb0Var, acb0Var, x340Var, 6, 8), x340Var, 0, 4);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tv7(this, i, (byte) 1);
        }
    }

    public final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1852995512);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (this.i) {
            x340Var.i0(625416522);
            d(x340Var, i2 & 14);
            x340Var.r(false);
        } else {
            x340Var.i0(625470059);
            c(x340Var, i2 & 14);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tv7(this, i, (byte) 2);
        }
    }
}
