package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yp51 extends co41 {
    public static final /* synthetic */ int Y = 0;
    public final psw X;
    public final f1n0 c;
    public final gw70 d;
    public final xgc e;
    public final l0x0 f;
    public final gap g;
    public final o3r h;
    public final js20 i;
    public final ia00 t;

    public yp51(f1n0 f1n0Var, gw70 gw70Var, xgc xgcVar, l0x0 l0x0Var, gap gapVar) {
        this.c = f1n0Var;
        this.d = gw70Var;
        this.e = xgcVar;
        this.f = l0x0Var;
        this.g = gapVar;
        jd11 jd11Var = rc11.a;
        this.h = w3p1.l(new l4r(new xv00(jd11Var.b(jo70.class)), 2, wp51.b, new j4r(th51.b1), wp51.c), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, wp51.d, new j4r(th51.c1), wp51.e), new l4r(new xv00(jd11Var.b(hll.class)), 2, wp51.f, new j4r(th51.d1), wp51.g), new l4r(new xv00(jd11Var.b(a7q0.class)), 2, wp51.h, new j4r(th51.e1), wp51.i), v451.d1);
        this.i = z0o1.j(new xul1(this, (byte) 0), new fk01(this, (byte) 14), new mn41(this, (byte) 19), 4);
        this.t = n3o1.q(this).a(v451.e1, vp51.b);
        j2i j2iVar = new j2i(986596682, new hg31(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final void f(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2138149045);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                tka0 tka0Var = dtw.C;
                ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                objT = mhc.b(context, composeView, this.g.a(e()), new k430(str, false, false), (ipb1) null, 112);
                x340Var.s0(objT);
            }
            dtw dtwVar = (dtw) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = th51.a1;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT2);
            boolean zI = x340Var.i(dtwVar);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new btw(dtwVar, (byte) 3);
                x340Var.s0(objT3);
            }
            iu30 iu30Var = (iu30) objT3;
            boolean zI2 = x340Var.i(dtwVar) | ((i2 & 14) == 4);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new rp51(dtwVar, str, (byte) 0);
                x340Var.s0(objT4);
            }
            dm5.a(iu30Var, qim0VarB, (iu30) objT4, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(this, str, i, (byte) 8);
        }
    }

    public final void g(String str, hy50 hy50Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1871634016);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(hy50Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new kdn0(gy50.a);
                x340Var.s0(objT);
            }
            kdn0 kdn0Var = (kdn0) objT;
            boolean zI = x340Var.i(kdn0Var) | x340Var.i(hy50Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new rl21(kdn0Var, hy50Var, (byte) 23);
                x340Var.s0(objT2);
            }
            qxd0.S((Function0) objT2, x340Var);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                tka0 tka0Var = dtw.C;
                ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                hsz0 hsz0Var = new hsz0(false);
                l0x0 l0x0Var = this.f;
                objT3 = mhc.b(context, composeView, new bs0((ofx) l0x0Var.b, (w3l0) l0x0Var.c, (lzn0) l0x0Var.d, kdn0Var, hsz0Var), new wsz0(str), (ipb1) null, 112);
                x340Var.s0(objT3);
            }
            dtw dtwVar = (dtw) objT3;
            boolean zI2 = x340Var.i(dtwVar);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new btw(dtwVar, (byte) 4);
                x340Var.s0(objT4);
            }
            iu30 iu30Var = (iu30) objT4;
            boolean zI3 = x340Var.i(dtwVar) | ((i2 & 14) == 4);
            Object objT5 = x340Var.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new rp51(dtwVar, str, (byte) 1);
                x340Var.s0(objT5);
            }
            dm5.a(iu30Var, (qim0) null, (iu30) objT5, x340Var, 0, 2);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(this, str, hy50Var, i, (byte) 21);
        }
    }

    public final mqw getBehavior() {
        return this.i;
    }

    /* JADX INFO: renamed from: getData, reason: collision with other method in class */
    public final o3r m1224getData() {
        return this.h;
    }

    public final f4r getData() {
        return this.h;
    }
}
