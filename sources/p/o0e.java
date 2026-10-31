package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o0e implements h0r0 {
    public final qyj a;
    public final hs3 b;
    public final msm0 c;
    public final xok0 d;
    public final a2r0 e;
    public final cbr0 f;

    public o0e(qyj qyjVar, hs3 hs3Var, msm0 msm0Var, xok0 xok0Var, a2r0 a2r0Var) {
        this.a = qyjVar;
        this.b = hs3Var;
        this.c = msm0Var;
        this.d = xok0Var;
        this.e = a2r0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.G1("ALLBOARDING_CAROUSEL", "allboarding/carousel", 143, qm3.b), new lik1("spotify:internal:allboarding:carousel"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-2102095002, new n0e(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        h311 h311VarV;
        n0e n0eVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(368088481);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            zo41 zo41Var = ((ls3) rwq.h(((ks3) this.b).e, x340Var, 0).getValue()).b.c;
            po41 po41Var = zo41Var instanceof po41 ? (po41) zo41Var : null;
            if (po41Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    n0eVar = new n0e(this, i, (byte) 1);
                }
            } else {
                Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                i8h1 i8h1Var = (i8h1) ((cir0) x340Var.k(k2r0.a)).g().b(i8h1.class);
                Object[] objArr = new Object[0];
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = xrc.Z;
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var, 48);
                boolean zI = x340Var.i(i8h1Var) | x340Var.i(this) | x340Var.i(ven0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new d1c(i8h1Var, this, ven0Var, (byte) 8);
                    x340Var.s0(objT2);
                }
                q3p1.b(0, 1, (Function0) objT2, x340Var, false);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var.i0(672938410);
                    String str = po41Var.c;
                    boolean zI2 = x340Var.i(ven0Var) | x340Var.i(this);
                    Object objT3 = x340Var.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new rqa(this, ven0Var, (byte) 20);
                        x340Var.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    boolean zI3 = x340Var.i(ven0Var);
                    Object objT4 = x340Var.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new bp9(ven0Var, (byte) 16);
                        x340Var.s0(objT4);
                    }
                    acq0.a(p791.b, str, this.e, function0, (Function0) objT4, x340Var, 6);
                    x340Var.r(false);
                } else {
                    x340Var.i0(673237281);
                    x340Var.r(false);
                }
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = this.c.a(new ez3((byte) 0));
                    x340Var.s0(objT5);
                }
                osm0 osm0Var = (osm0) objT5;
                boolean zG = x340Var.g(osm0Var);
                Object objT6 = x340Var.T();
                if (zG || objT6 == m4cVar) {
                    objT6 = osm0Var.b(new esm0((String) null, xrc.N0), 5);
                    x340Var.s0(objT6);
                }
                ttm0 ttm0Var = (ttm0) objT6;
                boolean zG2 = x340Var.g(ttm0Var);
                Object objT7 = x340Var.T();
                if (zG2 || objT7 == m4cVar) {
                    objT7 = ttm0Var.c(false);
                    x340Var.s0(objT7);
                }
                zau0 zau0Var = (zau0) objT7;
                boolean zI4 = x340Var.i(ttm0Var) | x340Var.i(zau0Var);
                Object objT8 = x340Var.T();
                if (zI4 || objT8 == m4cVar) {
                    objT8 = new q0e(ttm0Var, zau0Var, (byte) 0);
                    x340Var.s0(objT8);
                }
                qxd0.h(ttm0Var, zau0Var, (iu30) objT8, x340Var);
                c380 c380VarA = mqo1.A(po41Var.a);
                String str2 = po41Var.b;
                boolean zI5 = x340Var.i(this);
                Object objT9 = x340Var.T();
                if (zI5 || objT9 == m4cVar) {
                    objT9 = new ptb(this, (byte) 18);
                    x340Var.s0(objT9);
                }
                Function0 function1 = (Function0) objT9;
                boolean zI6 = x340Var.i(context);
                Object objT10 = x340Var.T();
                if (zI6 || objT10 == m4cVar) {
                    objT10 = new yd2(context, (byte) 2);
                    x340Var.s0(objT10);
                }
                vu30 vu30Var = (vu30) objT10;
                Object objT11 = x340Var.T();
                if (objT11 == m4cVar) {
                    objT11 = wnb.T0;
                    x340Var.s0(objT11);
                }
                wgo1.e(c380VarA, str2, zau0Var, function1, vu30Var, (vu30) objT11, (qim0) null, true, this.d, x340Var, 12779520, 64);
                x340Var = x340Var;
            }
            h311VarV.d = n0eVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            n0eVar = new n0e(this, i, (byte) 0);
            h311VarV.d = n0eVar;
        }
    }
}
