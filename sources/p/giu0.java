package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class giu0 {
    public static final long a = z4p1.e(1074926098);
    public static final float b = 513.0f;
    public static final float c = 156.0f;

    public static final void a(yj41 yj41Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-156153397);
        int i2 = i | (x340Var.i(yj41Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(yj41Var.a);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new yk4(yj41Var.a);
                x340Var.s0(objT);
            }
            yk4 yk4Var = (yk4) objT;
            String str = yj41Var.b;
            as80 as80Var = mif1.P0;
            long j = a;
            cwl1.g(yk4Var, str, a8o.D(sto1.o(qim0Var, 16.0f, d4o1.a, false, j, j, 4), function0), as80Var, 0, x340Var, 24576, 232);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(yj41Var, function0, qim0Var, i, (byte) 15);
        }
    }

    public static final void b(List list, boolean z, boolean z2, boolean z3, Integer num, iu30 iu30Var, float f, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        boolean z4;
        boolean z5;
        iu30 iu30Var2;
        List list2;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(199895648);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(list) : x340Var.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= x340Var.h(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            z5 = z3;
            i2 |= x340Var.h(z5) ? 2048 : 1024;
        } else {
            z5 = z3;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(num) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var.i(iu30Var2) ? 131072 : 65536;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var.d(f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var.g(qim0Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            int size = list.size();
            tzg1 tzg1Var = hiu0.a;
            if (size != 3) {
                if (size != 4) {
                    if (size != 5) {
                        list2 = null;
                    } else if (num != null && num.intValue() == 1) {
                        list2 = hiu0.l;
                    } else if (num != null && num.intValue() == 2) {
                        list2 = hiu0.m;
                    } else if (num != null && num.intValue() == 3) {
                        list2 = hiu0.n;
                    } else if (num != null && num.intValue() == 4) {
                        list2 = hiu0.o;
                    } else {
                        list2 = (num != null && num.intValue() == 5) ? hiu0.f21p : hiu0.d;
                    }
                } else if (num != null && num.intValue() == 1) {
                    list2 = hiu0.h;
                } else if (num != null && num.intValue() == 2) {
                    list2 = hiu0.i;
                } else if (num != null && num.intValue() == 3) {
                    list2 = hiu0.j;
                } else {
                    list2 = (num != null && num.intValue() == 4) ? hiu0.k : hiu0.c;
                }
            } else if (num != null && num.intValue() == 1) {
                list2 = hiu0.e;
            } else if (num != null && num.intValue() == 2) {
                list2 = hiu0.f;
            } else {
                list2 = (num != null && num.intValue() == 3) ? hiu0.g : hiu0.b;
            }
            if (list2 == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new eiu0(list, z, z4, z5, num, iu30Var2, f, qim0Var, i, (byte) 1);
                    return;
                }
                return;
            }
            p3v p3vVarM = yoi1.m(new p3v(0.4f * f), new p3v(b));
            bzg bzgVar = new bzg(yoi1.m(new p3v(c), p3vVarM).a, p3vVarM.a);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fiu0.b;
                x340Var.s0(objT);
            }
            yua0 yua0VarE0 = irn1.e0((iu30) objT);
            tzg1 tzg1Var2 = rno1.a;
            int i4 = (i3 & 112) | 8 | ((i3 >> 3) & 896);
            ven0 ven0VarS = zod.S(new hsi1("topPlaylistsFirstCoverNudgeScale", fValueOf, fValueOf, yua0VarE0, tzg1Var2), z, z3, (Function0) null, x340Var, i4, 8);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = hxt0.e1;
                x340Var.s0(objT2);
            }
            ven0 ven0VarS2 = zod.S(new hsi1("topPlaylistsFirstCoverNudgeRotation", fValueOf2, fValueOf2, irn1.e0((iu30) objT2), tzg1Var2), z, z3, (Function0) null, x340Var, i4, 8);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = hxt0.d1;
                x340Var.s0(objT3);
            }
            w2g0.c(s161.a(qim0VarF, (iu30) objT3), (tl3) null, apo.r(213140426, new diu0(bzgVar, ven0VarS, ven0VarS2, list, list2, z, z2, iu30Var, num), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new eiu0(list, z, z2, z3, num, iu30Var, f, qim0Var, i, (byte) 0);
        }
    }
}
