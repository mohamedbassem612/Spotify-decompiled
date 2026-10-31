package p;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fus {
    public static final nfv0 a = new nfv0(30, true, false, false);

    public static final void a(r3e1 r3e1Var, f3e1 f3e1Var, b0k b0kVar, int i) {
        Context context;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1904307118);
        int i2 = (x340Var.g(r3e1Var) ? 4 : 2) | i | (x340Var.i(f3e1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                x340Var.i0(-1009482584);
                context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                x340Var.r(false);
            } else {
                x340Var.i0(-1009433480);
                x340Var.r(false);
                context = null;
            }
            boolean zI = x340Var.i(f3e1Var) | ((i2 & 14) == 4) | x340Var.i(context);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new pg((Object) f3e1Var, (Object) context, (Object) r3e1Var, (byte) 10);
                x340Var.s0(objT);
            }
            ijm.b(null, null, (iu30) objT, x340Var, 0, 3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f14(r3e1Var, f3e1Var, i, (byte) 11);
        }
    }

    public static final void b(final int i, final int i2, final long j, b0k b0kVar) {
        int i3;
        int i4;
        h311 h311VarV;
        vu30 vu30Var;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (x340Var.e(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.f(j) ? 32 : 16;
        }
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zG = ((i4 & 14) == 4) | x340Var.g(context);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                x340Var.s0(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            if (iIntValue == -1) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                }
                final byte b = 0;
                final int i5 = i3;
                vu30Var = new vu30() { // from class: p.dus
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b2 = b;
                        rih1 rih1Var = rih1.a;
                        int i6 = i2;
                        long j2 = j;
                        int i7 = i5;
                        b0k b0kVar2 = (b0k) obj2;
                        ((Integer) obj3).getClass();
                        switch (b2) {
                            case 0:
                                fus.b(i7, czo1.p(i6 | 1), j2, b0kVar2);
                                break;
                            default:
                                fus.b(i7, czo1.p(i6 | 1), j2, b0kVar2);
                                break;
                        }
                        return rih1Var;
                    }
                };
            } else {
                jmr0 jmr0VarN = i3o1.n(iIntValue, x340Var, 0);
                boolean z = (i4 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                Object objT2 = x340Var.T();
                if (z || objT2 == obj) {
                    objT2 = j == 16 ? null : new f2b(j, 5);
                    x340Var.s0(objT2);
                }
                t1c.a(xyn1.s(u291.r(nim0.a, ajm.e), jmr0VarN, (tl3) null, mif1.Q0, 0.0f, (ColorFilter) objT2, 22), x340Var, 0);
            }
            h311VarV.d = vu30Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            final byte b2 = 1;
            vu30Var = new vu30() { // from class: p.dus
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b2;
                    rih1 rih1Var = rih1.a;
                    int i6 = i2;
                    long j2 = j;
                    int i7 = i;
                    b0k b0kVar2 = (b0k) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            fus.b(i7, czo1.p(i6 | 1), j2, b0kVar2);
                            break;
                        default:
                            fus.b(i7, czo1.p(i6 | 1), j2, b0kVar2);
                            break;
                    }
                    return rih1Var;
                }
            };
            h311VarV.d = vu30Var;
        }
    }

    public static final void c(r3e1 r3e1Var, g3e1 g3e1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(r3e1Var) : x340Var.i(r3e1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(g3e1Var) : x340Var.i(g3e1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32 || ((i2 & 64) != 0 && x340Var.g(g3e1Var));
            Object objT = x340Var.T();
            if (z2 || objT == obj) {
                objT = new g3g0(new rim(new og(g3e1Var, function0, (byte) 19)));
                x340Var.s0(objT);
            }
            g3g0 g3g0Var = (g3g0) objT;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && x340Var.i(r3e1Var))) {
                z = true;
            }
            Object objT2 = x340Var.T();
            if (z || objT2 == obj) {
                objT2 = new hx4(r3e1Var, (byte) 25);
                x340Var.s0(objT2);
            }
            sy4.a(g3g0Var, (Function0) objT2, a, apo.r(1315155414, new f14((Object) g3e1Var, (Object) r3e1Var, (byte) 10), x340Var), x340Var, 3456, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05((Object) r3e1Var, (Object) g3e1Var, (cv30) function0, i, (byte) 4);
        }
    }

    public static final void d(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1392105195);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w6p1.d(qim0Var, p3e1.a, j2iVar, x340Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f45((byte) 2, i, j2iVar, qim0Var);
        }
    }
}
