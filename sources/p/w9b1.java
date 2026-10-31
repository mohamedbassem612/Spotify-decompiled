package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class w9b1 {
    public static final df41 a = new df41(v3b1.R0, nva1.g);

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:60:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(bab1 bab1Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        ld41 ld41VarG;
        int i5;
        boolean z2;
        Object objT;
        Object objT2;
        Set set;
        boolean z3;
        boolean zG;
        Object objT3;
        int i6;
        boolean z4;
        Object objT4;
        Object objT5;
        int i7;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1936890734);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(bab1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.g(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (b0kVar3.i(j2iVar)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                if (i8 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                ld41VarG = sgc1.G(b0kVar3);
                i5 = i4 & 14;
                if (i5 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = b0kVar3.T();
                if (z2 || objT == m4cVar) {
                    objT = yv91.a(new fue0(bab1Var, (byte) 2));
                    b0kVar3.s0(objT);
                }
                tob1 tob1Var = (tob1) objT;
                Object[] objArr = new Object[0];
                objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = l4b1.g;
                    b0kVar3.s0(objT2);
                }
                set = (Set) k5p1.u(objArr, a, (Function0) objT2, b0kVar3, 384);
                if (i5 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG = z3 | b0kVar3.g(set) | b0kVar3.i(ld41VarG);
                objT3 = b0kVar3.T();
                if (!zG || objT3 == m4cVar) {
                    i6 = i5;
                    uk71 uk71Var = new uk71(bab1Var, set, ld41VarG, (lnm) null, (byte) 28);
                    b0kVar3.s0(uk71Var);
                    objT3 = uk71Var;
                } else {
                    i6 = i5;
                }
                qxd0.t(bab1Var, b0kVar3, (vu30) objT3);
                z9b1 z9b1Var = (z9b1) tob1Var.getValue();
                if (i6 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT4 = b0kVar3.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new l5b1(bab1Var, (byte) 2);
                    b0kVar3.s0(objT4);
                }
                iu30 iu30Var = (iu30) objT4;
                objT5 = b0kVar3.T();
                if (objT5 == m4cVar) {
                    objT5 = v3b1.Q0;
                    b0kVar3.s0(objT5);
                }
                b0kVar2 = b0kVar3;
                qim0 qim0Var5 = qim0Var4;
                hm5.a(z9b1Var, qim0Var5, iu30Var, (tl3) null, "StackNode", (iu30) objT5, apo.r(922902415, new juy0(ld41VarG, j2iVar, (byte) 6), b0kVar3), b0kVar2, (i4 & 112) | 1794048, 8);
                qim0Var3 = qim0Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1(bab1Var, qim0Var3, j2iVar, i, i2, (byte) 22);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (b0kVar3.i(j2iVar)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            if (i8 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            ld41VarG = sgc1.G(b0kVar3);
            i5 = i4 & 14;
            if (i5 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objT = b0kVar3.T();
            if (z2) {
                objT = yv91.a(new fue0(bab1Var, (byte) 2));
                b0kVar3.s0(objT);
            } else {
                objT = yv91.a(new fue0(bab1Var, (byte) 2));
                b0kVar3.s0(objT);
            }
            tob1 tob1Var2 = (tob1) objT;
            Object[] objArr2 = new Object[0];
            objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = l4b1.g;
                b0kVar3.s0(objT2);
            }
            set = (Set) k5p1.u(objArr2, a, (Function0) objT2, b0kVar3, 384);
            if (i5 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG = z3 | b0kVar3.g(set) | b0kVar3.i(ld41VarG);
            objT3 = b0kVar3.T();
            if (zG) {
                i6 = i5;
                uk71 uk71Var2 = new uk71(bab1Var, set, ld41VarG, (lnm) null, (byte) 28);
                b0kVar3.s0(uk71Var2);
                objT3 = uk71Var2;
            } else {
                i6 = i5;
                uk71 uk71Var3 = new uk71(bab1Var, set, ld41VarG, (lnm) null, (byte) 28);
                b0kVar3.s0(uk71Var3);
                objT3 = uk71Var3;
            }
            qxd0.t(bab1Var, b0kVar3, (vu30) objT3);
            z9b1 z9b1Var2 = (z9b1) tob1Var2.getValue();
            if (i6 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            objT4 = b0kVar3.T();
            if (z4) {
                objT4 = new l5b1(bab1Var, (byte) 2);
                b0kVar3.s0(objT4);
            } else {
                objT4 = new l5b1(bab1Var, (byte) 2);
                b0kVar3.s0(objT4);
            }
            iu30 iu30Var2 = (iu30) objT4;
            objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = v3b1.Q0;
                b0kVar3.s0(objT5);
            }
            b0kVar2 = b0kVar3;
            qim0 qim0Var6 = qim0Var4;
            hm5.a(z9b1Var2, qim0Var6, iu30Var2, (tl3) null, "StackNode", (iu30) objT5, apo.r(922902415, new juy0(ld41VarG, j2iVar, (byte) 6), b0kVar3), b0kVar2, (i4 & 112) | 1794048, 8);
            qim0Var3 = qim0Var6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(bab1Var, qim0Var3, j2iVar, i, i2, (byte) 22);
        }
    }
}
